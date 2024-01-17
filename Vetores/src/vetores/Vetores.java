/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author j4marcos
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3] ;
        n[0] = scan.nextInt();
        n[1] = scan.nextInt();
        n[2] = scan.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n.length;i++) {
            if (n[i] > max) max = n[i];
        }
        System.out.println(max);
    }
    
}
