/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sistema.asistencia.util.test;

import com.sistema.asistencia.dao.DocenteDAO;
import com.sistema.asistencia.dao.RolDAO;
import com.sistema.asistencia.dao.impl.DocenteDAOImpl;
import com.sistema.asistencia.dao.impl.RolDAOImpl;
import com.sistema.asistencia.modelo.Docente;
import com.sistema.asistencia.modelo.Rol;

/**
 *
 * @author User
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Docente docente = new Docente(1, "76319768", "Danny", "Hinostroza", "957302463", "Dannyghp577@gmail.com", 27, true);

     DocenteDAO dao = new DocenteDAOImpl();

        if (dao.registrar(docente)) {
            System.out.println("✅ DOCENTE REGISTRADO CORRECTAMENTE");
        } else {
            System.out.println("❌ ERROR AL REGISTRAR DOCENTE");
        }

//Rol r = new Rol(0,"Prueba");
//RolDAO dao = new RolDAOImpl();
//dao.registrar(r);

    }

}
