/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenciapormultiplicaciones;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class PotenciaPorMultiplicaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        int base = input.nextInt();
        
        System.out.print("Ingrese el exponente: ");
        int exponente = input.nextInt();
        
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        
        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
    }
}