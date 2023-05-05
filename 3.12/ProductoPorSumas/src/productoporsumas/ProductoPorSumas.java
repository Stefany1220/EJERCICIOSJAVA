/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productoporsumas;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class ProductoPorSumas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        
        int producto = 0;
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
    }
}