/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

/**
 *
 * @author User
 */
public class Curso {
        private int id;
    private String nombre;
    private int horasSemanales;

    public Curso() {}

    public Curso(int id, String nombre, int horasSemanales) {
        this.id = id;
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getHorasSemanales() { return horasSemanales; }
    public void setHorasSemanales(int horasSemanales) { this.horasSemanales = horasSemanales; }
}
