/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.dao;

import java.util.List;

import com.sistema.asistencia.modelo.Usuario;

/**
 *
 * @author User
 */
public interface UsuarioDAO {

    boolean registrar(Usuario u);

    List<Usuario> listar();

    boolean actualizar(Usuario u);

    boolean eliminar(int id);

    Usuario login(String usuario, String password);
}