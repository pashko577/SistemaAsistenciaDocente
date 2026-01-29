package com.sistema.asistencia.util.test;

import com.sistema.asistencia.dao.UsuarioDAO;
import com.sistema.asistencia.dao.impl.UsuarioDAOImpl;
import com.sistema.asistencia.modelo.Usuario;

public class TestLogin {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAOImpl();

        String user = "admin";     // cambia por uno real
        String pass = "123456";    // cambia por uno real

        Usuario u = dao.login(user, pass);

        if (u != null) {
            System.out.println("LOGIN CORRECTO");
            System.out.println("Usuario: " + u.getUsuario());
            System.out.println("Rol: " + u.getRol().getNombre());

            if (u.getDocente() != null) {
                System.out.println("Docente: "
                        + u.getDocente().getNombres() + " "
                        + u.getDocente().getApellidos());
            } else {
                System.out.println("Usuario sin docente asignado");
            }

        } else {
            System.out.println("USUARIO O CONTRASEÑA INCORRECTA");
        }
    }
}