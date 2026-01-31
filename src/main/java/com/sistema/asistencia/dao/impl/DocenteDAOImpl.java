/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.dao.impl;

import com.sistema.asistencia.config.Conexion;
import com.sistema.asistencia.dao.DocenteDAO;
import com.sistema.asistencia.modelo.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class DocenteDAOImpl implements DocenteDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean registrar(Docente d) {

        String sql = "INSERT INTO docentes(dni,nombres,apellidos,telefono,correo,pago_hora,estado) "
                   + "VALUES (?,?,?,?,?,?,?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, d.getDni());
            ps.setString(2, d.getNombres());
            ps.setString(3, d.getApellidos());
            ps.setString(4, d.getTelefono());
            ps.setString(5, d.getCorreo());
            ps.setDouble(6, d.getPagoHora());
            ps.setBoolean(7, d.isEstado());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Registrar Docente: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Docente> listar() {

        List<Docente> lista = new ArrayList<>();
        String sql = "SELECT * FROM docentes";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Docente d = new Docente();

                d.setIdDocente(rs.getInt("id_docente"));
                d.setDni(rs.getString("dni"));
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setTelefono(rs.getString("telefono"));
                d.setCorreo(rs.getString("correo"));
                d.setPagoHora(rs.getDouble("pago_hora"));
                d.setEstado(rs.getBoolean("estado"));

                lista.add(d);
            }

        } catch (SQLException e) {
            System.out.println("Error Listar Docente: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public boolean actualizar(Docente d) {

        String sql = "UPDATE docentes SET dni=?,nombres=?,apellidos=?,telefono=?,correo=?,pago_hora=?,estado=? "
                   + "WHERE id_docente=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, d.getDni());
            ps.setString(2, d.getNombres());
            ps.setString(3, d.getApellidos());
            ps.setString(4, d.getTelefono());
            ps.setString(5, d.getCorreo());
            ps.setDouble(6, d.getPagoHora());
            ps.setBoolean(7, d.isEstado());
            ps.setInt(8, d.getIdDocente());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Actualizar Docente: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {

        String sql = "UPDATE docentes SET estado=false WHERE id_docente=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Eliminar Docente: " + e.getMessage());
            return false;
        }
    }
    @Override
    public List<Docente> listarDisponibles() {

    List<Docente> lista = new ArrayList<>();

    String sql =
    "SELECT d.* FROM docentes d " +
    "LEFT JOIN usuarios u ON d.id_docente = u.id_docente " +
    "WHERE u.id_usuario IS NULL AND d.estado = true";

    try {
        con = Conexion.getConexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {

            Docente d = new Docente();
            d.setIdDocente(rs.getInt("id_docente"));
            d.setNombres(rs.getString("nombres"));
            d.setApellidos(rs.getString("apellidos"));
            lista.add(d);
        }

    } catch (SQLException e) {
        System.out.println("Error listarDisponibles: " + e.getMessage());
    }

    return lista;
}

}
