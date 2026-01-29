/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

/**
 *
 * @author User
 */
public class Docente {
    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private double pagoHora;
    private boolean activo;

    public Docente() {}

    public Docente(int id, String dni, String nombres, String apellidos,
                   String telefono, String email, double pagoHora, boolean activo) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.pagoHora = pagoHora;
        this.activo = activo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getPagoHora() { return pagoHora; }
    public void setPagoHora(double pagoHora) { this.pagoHora = pagoHora; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
