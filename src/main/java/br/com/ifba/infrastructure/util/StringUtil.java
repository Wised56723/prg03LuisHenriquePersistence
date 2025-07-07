/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis2
 */
package br.com.ifba.infrastructure.util;

public class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}

