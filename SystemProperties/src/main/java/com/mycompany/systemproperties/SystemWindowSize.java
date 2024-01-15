/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproperties;

import java.awt.Toolkit;



/**
 *
 * @author j4marcos
 */
public class SystemWindowSize {
    public static void main(String[] args) {
        System.out.println();
    }
    
    public static Object getScreemSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
