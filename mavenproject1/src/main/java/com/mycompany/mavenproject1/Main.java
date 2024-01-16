//import java.io.IOException;
 import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        
        double triangulo = ((a*c)/2);
        
        System.out.printf("TRIANGULO: %.3lf\n"+triangulo);
        double circulo = (3.14159*c*c);
        
        System.out.printf("CIRCULO:  %.3lf\n"+circulo);
        double trapezio = (a + b)*c /2;
        
        System.out.printf("TRAPEZIO:  %.3lf\n"+ trapezio);
        double quadrado = b*b;
        
        System.out.printf("QUADRADO:  %.3lf\n"+ quadrado);
        double retangulo = a*b;
       
        System.out.printf("RETANGULO:  %.3lf\n"+ retangulo);
        
 
    }
 
}