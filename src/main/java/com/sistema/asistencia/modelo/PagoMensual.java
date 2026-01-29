/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

/**
 *
 * @author User
 */
public class PagoMensual {
      private int idPago;
    private Docente docente;
    private int mes;
    private int anio;
    private int horasTrabajadas;
    private double totalBruto;
    private double totalDescuentos;
    private double totalPagar;

    public PagoMensual() {}

    public PagoMensual(int idPago, Docente docente, int mes, int anio,
                       int horasTrabajadas, double totalBruto,
                       double totalDescuentos, double totalPagar) {
        this.idPago = idPago;
        this.docente = docente;
        this.mes = mes;
        this.anio = anio;
        this.horasTrabajadas = horasTrabajadas;
        this.totalBruto = totalBruto;
        this.totalDescuentos = totalDescuentos;
        this.totalPagar = totalPagar;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public double getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(double totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
}
