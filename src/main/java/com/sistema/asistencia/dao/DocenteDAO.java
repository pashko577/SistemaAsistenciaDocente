/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.asistencia.dao;

import com.sistema.asistencia.modelo.Docente;
import java.util.List;

/**
 *
 * @author User
 */
public interface DocenteDAO {

    boolean registrar(Docente d);

    List<Docente> listar();

    boolean actualizar(Docente d);

    boolean eliminar(int id);

    List<Docente> listarDisponibles();
}
