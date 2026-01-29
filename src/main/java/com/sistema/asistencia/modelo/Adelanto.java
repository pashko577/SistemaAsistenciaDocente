/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Adelanto {
     private int id;
    private int docenteId;
    private double monto;
    private String motivo;
    private LocalDate fecha;

    public Adelanto() {}

    public Adelanto(int id, int docenteId, double monto, String motivo, LocalDate fecha) {
        this.id = id;
        this.docenteId = docenteId;
        this.monto = monto;
        this.motivo = motivo;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getDocenteId() { return docenteId; }
    public void setDocenteId(int docenteId) { this.docenteId = docenteId; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
