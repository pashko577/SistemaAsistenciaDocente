/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.modelo;

/**
 *
 * @author User
 */
public class Usuario {
      private int id;
    private String username;
    private String password;
    private int rolId;
    private int docenteId;

    public Usuario() {}

    public Usuario(int id, String username, String password, int rolId, int docenteId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rolId = rolId;
        this.docenteId = docenteId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getRolId() { return rolId; }
    public void setRolId(int rolId) { this.rolId = rolId; }

    public int getDocenteId() { return docenteId; }
    public void setDocenteId(int docenteId) { this.docenteId = docenteId; }
}
