/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package studing.tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author j4marcos
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        float nota = 8.5f;
        int numero = (int) 3.15;
        System.out.println("Hello World!" + numero);
        System.out.format("texto formatado %.5f\n",nota);
        
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println(nome);
        String valorEscrito = Integer.toString(numero);
        System.out.println( valorEscrito);
        
        String escricao = "123";
        int n = Integer.parseInt(escricao);
  
        
              
        
    }
}
