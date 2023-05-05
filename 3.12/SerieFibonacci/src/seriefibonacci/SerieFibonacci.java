/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriefibonacci;

/**
 *
 * @author Ambiente 209-1
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        int limite = 100;
        int num1 = 0;
        int num2 = 1;
        
        System.out.print(num1 + " " + num2);
        
        while (num2 < limite) {
            int suma = num1 + num2;
            System.out.print(" " + suma);
            num1 = num2;
            num2 = suma;
        }
    }
}