/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.asistencia.util.test;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author User
 */
public class PasswordUtil {
       // Hashear la contraseña
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt(12)); // 12 = fuerza del hash
    }

    // Verificar contraseña
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        if (hashedPassword == null || !hashedPassword.startsWith("$2a$")) {
            throw new IllegalArgumentException("Formato de hash inválido");
        }
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
