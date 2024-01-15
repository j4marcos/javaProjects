/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.systemproperties;
import java.util.Locale;
/**
 *
 * @author j4marcos
 */
public class SystemLang {
    
    public static void main(String[] args) {
        
        
    }
    
    public static String getSystemLanguage() {
       return  Locale.getDefault().getDisplayLanguage();
    }
    
}
