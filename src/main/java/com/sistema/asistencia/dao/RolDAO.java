/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.asistencia.dao;

import java.util.List;

import com.sistema.asistencia.modelo.Rol;

/**
 *
 * @author User
 */
public interface RolDAO {
        boolean registrar(Rol r);
    List<Rol> listar();
    Rol buscarPorId(int id);
}
