/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

/**
 *
 * @author User
 */
public class Pago {
    
    private int id;
    private int docenteId;
    private String mes;
    private double totalHoras;
    private double totalAdelantos;
    private double totalPagar;

    public Pago() {}

    public Pago(int id, int docenteId, String mes,
                double totalHoras, double totalAdelantos, double totalPagar) {
        this.id = id;
        this.docenteId = docenteId;
        this.mes = mes;
        this.totalHoras = totalHoras;
        this.totalAdelantos = totalAdelantos;
        this.totalPagar = totalPagar;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getDocenteId() { return docenteId; }
    public void setDocenteId(int docenteId) { this.docenteId = docenteId; }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public double getTotalHoras() { return totalHoras; }
    public void setTotalHoras(double totalHoras) { this.totalHoras = totalHoras; }

    public double getTotalAdelantos() { return totalAdelantos; }
    public void setTotalAdelantos(double totalAdelantos) { this.totalAdelantos = totalAdelantos; }

    public double getTotalPagar() { return totalPagar; }
    public void setTotalPagar(double totalPagar) { this.totalPagar = totalPagar; }
}
