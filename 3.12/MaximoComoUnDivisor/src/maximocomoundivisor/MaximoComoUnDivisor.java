/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximocomoundivisor;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class MaximoComoUnDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int mcd = 1;
        
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
        }
        
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
}