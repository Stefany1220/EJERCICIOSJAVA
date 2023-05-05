/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimocomunmultiplo;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class MinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int mcm = 0;
        int i = 1;
        
        while (mcm == 0) {
            if ((i % num1 == 0) && (i % num2 == 0)) {
                mcm = i;
            }
            i++;
        }
        
        System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
    }
}