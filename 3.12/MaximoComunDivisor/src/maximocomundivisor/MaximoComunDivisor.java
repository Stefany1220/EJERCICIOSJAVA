/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximocomundivisor;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        if (num1 % 2 == 0) {
            int mcd = calcularMCD(num1, num2);
            System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }
    
    public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}