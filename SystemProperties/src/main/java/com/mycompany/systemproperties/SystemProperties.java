/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.systemproperties;

/**
 *
 * @author j4marcos
 */
public class SystemProperties {

    public static void main(String[] args) {
      
        NewJFrame.main();
        String date = SystemHour.getDate();
        String lang = SystemLang.getSystemLanguage();
        Object windowSize = SystemWindowSize.getScreemSize();
        
       
        System.out.println(date);
        System.out.println(lang);
        System.out.println(windowSize);
        
    }
}
