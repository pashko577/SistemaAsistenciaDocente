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
public class Descuento {
      private int idDescuento;
    private Docente docente;
    private LocalDate fecha;
    private double monto;
    private String motivo;
    private String tipo;

    public Descuento() {}

    public Descuento(int idDescuento, Docente docente,
                     LocalDate fecha, double monto,
                     String motivo, String tipo) {
        this.idDescuento = idDescuento;
        this.docente = docente;
        this.fecha = fecha;
        this.monto = monto;
        this.motivo = motivo;
        this.tipo = tipo;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
