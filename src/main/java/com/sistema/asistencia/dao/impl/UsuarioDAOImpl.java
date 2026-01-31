/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sistema.asistencia.config.Conexion;
import com.sistema.asistencia.dao.UsuarioDAO;
import com.sistema.asistencia.modelo.Docente;
import com.sistema.asistencia.modelo.Rol;
import com.sistema.asistencia.modelo.Usuario;
import com.sistema.asistencia.util.test.PasswordUtil;

/**
 *
 * @author User
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean registrar(Usuario u) {

        String sql = "INSERT INTO usuarios(usuario,password,id_rol,id_docente,estado) VALUES (?,?,?,?,?)";

        try {

            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, u.getUsuario());
            ps.setString(2, PasswordUtil.encriptar(u.getPassword()));
            ps.setInt(3, u.getRol().getIdRol());

            if (u.getDocente() != null) {
                ps.setInt(4, u.getDocente().getIdDocente());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }

            ps.setBoolean(5, u.isEstado());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Registrar Usuario: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Usuario> listar() {

        List<Usuario> lista = new ArrayList<>();

        String sql = "SELECT u.id_usuario, u.usuario, u.estado, "
                + "r.id_rol, r.nombre AS rol, "
                + "d.id_docente, d.nombres, d.apellidos "
                + "FROM usuarios u "
                + "INNER JOIN roles r ON u.id_rol = r.id_rol "
                + "LEFT JOIN docentes d ON u.id_docente = d.id_docente";

        try {

            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setUsuario(rs.getString("usuario"));
                u.setEstado(rs.getBoolean("estado"));

                Rol r = new Rol();
                r.setIdRol(rs.getInt("id_rol"));
                r.setNombre(rs.getString("rol"));
                u.setRol(r);

                // 👇 DOCENTE (si existe)
                if (rs.getInt("id_docente") != 0) {
                    Docente d = new Docente();
                    d.setIdDocente(rs.getInt("id_docente"));
                    d.setNombres(rs.getString("nombres"));
                    d.setApellidos(rs.getString("apellidos"));
                    u.setDocente(d);
                } else {
                    u.setDocente(null);
                }

                lista.add(u);
            }

        } catch (SQLException e) {
            System.out.println("Error Listar Usuario: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public boolean actualizar(Usuario u) {

        String sql = "UPDATE usuarios SET usuario=?, password=?, id_rol=?, id_docente=?, estado=? WHERE id_usuario=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getPassword());
            ps.setInt(3, u.getRol().getIdRol());

            // 👉 DOCENTE
            if (u.getDocente() != null) {
                ps.setInt(4, u.getDocente().getIdDocente());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }

            ps.setBoolean(5, u.isEstado());
            ps.setInt(6, u.getIdUsuario());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Actualizar Usuario: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {

        String sql = "UPDATE usuarios SET estado=false WHERE id_usuario=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Eliminar Usuario: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Usuario login(String usuario, String password) {

        Usuario u = null;

        String sql = "SELECT u.*, r.id_rol, r.nombre AS rol_nombre, "
                + "d.id_docente, d.nombres, d.apellidos "
                + "FROM usuarios u "
                + "INNER JOIN roles r ON u.id_rol = r.id_rol "
                + "LEFT JOIN docentes d ON u.id_docente = d.id_docente "
                + "WHERE u.usuario=? AND u.estado=true";

        try {

            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {

                String hashBD = rs.getString("password");

                if (PasswordUtil.verificar(password, hashBD)) {

                    u = new Usuario();
                    u.setIdUsuario(rs.getInt("id_usuario"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setPassword(hashBD);
                    u.setEstado(rs.getBoolean("estado"));

                    Rol r = new Rol();
                    r.setIdRol(rs.getInt("id_rol"));
                    r.setNombre(rs.getString("rol_nombre"));
                    u.setRol(r);

                    if (rs.getInt("id_docente") != 0) {
                        Docente d = new Docente();
                        d.setIdDocente(rs.getInt("id_docente"));
                        d.setNombres(rs.getString("nombres"));
                        d.setApellidos(rs.getString("apellidos"));
                        u.setDocente(d);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error Login: " + e.getMessage());
        }

        return u;
    }

    @Override
    public String obtenerPassword(int idUsuario) {

        String pass = "";

        String sql = "SELECT password FROM usuarios WHERE id_usuario=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                pass = rs.getString("password");
            }

        } catch (SQLException e) {
            System.out.println("Error obtenerPassword: " + e.getMessage());
        }

        return pass;
    }

}
