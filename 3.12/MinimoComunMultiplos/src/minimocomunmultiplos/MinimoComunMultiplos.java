/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimocomunmultiplos;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class MinimoComunMultiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        if (num2 % 2 != 0) {
            int mcm = calcularMCM(num1, num2);
            System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
        }
    }
    
    public static int calcularMCM(int num1, int num2) {
        int mcm = 0;
        int maximo = Math.max(num1, num2);
        
        for (int i = maximo; i <= num1 * num2; i += maximo) {
            if (i % num1 == 0 && i % num2 == 0) {
                mcm = i;
                break;
            }
        }
        
        return mcm;
    }
}