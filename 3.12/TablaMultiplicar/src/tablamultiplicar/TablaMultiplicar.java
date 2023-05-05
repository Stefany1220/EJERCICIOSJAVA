/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el multiplicando: ");
        int multiplicando = input.nextInt();
        
        System.out.print("Ingrese el multiplicador: ");
        int multiplicador = input.nextInt();
        
        int producto = multiplicando * multiplicador;
        
        System.out.println("El producto de " + multiplicando + " y " + multiplicador + " es: " + producto);
        
        System.out.println("Tabla de multiplicar de " + multiplicando + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = multiplicando * i;
            System.out.println(multiplicando + " x " + i + " = " + resultado);
        }
    }
}
