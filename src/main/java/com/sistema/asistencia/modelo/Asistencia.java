/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author User
 */
public class Asistencia {
    
  
    private int idAsistencia;
    private Docente docente;
    private LocalDate fecha;
    private LocalTime horaIngreso;
    private String estado;
    private int minutosTarde;

    public Asistencia() {}

    public Asistencia(int idAsistencia, Docente docente,
                      LocalDate fecha, LocalTime horaIngreso,
                      String estado, int minutosTarde) {
        this.idAsistencia = idAsistencia;
        this.docente = docente;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.estado = estado;
        this.minutosTarde = minutosTarde;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMinutosTarde() {
        return minutosTarde;
    }

    public void setMinutosTarde(int minutosTarde) {
        this.minutosTarde = minutosTarde;
    }
}
