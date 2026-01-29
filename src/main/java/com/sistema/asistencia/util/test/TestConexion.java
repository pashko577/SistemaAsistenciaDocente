/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.util.test;

import com.sistema.asistencia.config.Conexion;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class TestConexion {
       public static void main(String[] args) {

           Connection cn = Conexion.getConexion();

        if (cn != null) {
            System.out.println("✅ CONECTADO A MYSQL");
        } else {
            System.out.println("❌ ERROR DE CONEXIÓN");
        }
    }
}
