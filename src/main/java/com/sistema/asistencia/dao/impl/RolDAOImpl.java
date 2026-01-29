package com.sistema.asistencia.dao.impl;

import com.sistema.asistencia.config.Conexion;
import com.sistema.asistencia.dao.RolDAO;
import com.sistema.asistencia.modelo.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class RolDAOImpl implements RolDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean registrar(Rol r) {

        String sql = "INSERT INTO roles(nombre) VALUES (?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getNombre());
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Registrar Rol: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Rol> listar() {

        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT * FROM roles";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Rol r = new Rol();
                r.setIdRol(rs.getInt("id_rol"));
                r.setNombre(rs.getString("nombre"));
                lista.add(r);
            }

        } catch (SQLException e) {
            System.out.println("Error Listar Rol: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public Rol buscarPorId(int id) {

        Rol r = null;
        String sql = "SELECT * FROM roles WHERE id_rol=?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                r = new Rol();
                r.setIdRol(rs.getInt("id_rol"));
                r.setNombre(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error Buscar Rol: " + e.getMessage());
        }

        return r;
    }
}
