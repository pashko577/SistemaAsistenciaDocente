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
    
    private int id;
    private int docenteId;
    private LocalDate fecha;
    private LocalTime horaIngreso;
    private String estado; // PUNTUAL, TARDE, FALTA

    public Asistencia() {}

    public Asistencia(int id, int docenteId, LocalDate fecha,
                      LocalTime horaIngreso, String estado) {
        this.id = id;
        this.docenteId = docenteId;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getDocenteId() { return docenteId; }
    public void setDocenteId(int docenteId) { this.docenteId = docenteId; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraIngreso() { return horaIngreso; }
    public void setHoraIngreso(LocalTime horaIngreso) { this.horaIngreso = horaIngreso; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
