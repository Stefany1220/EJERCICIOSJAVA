/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprastienda;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class ComprasTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de artículos que va a comprar: ");
        int cantidad = sc.nextInt();
        
        double total = 0;
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el precio del artículo " + i + ": ");
            double precio = sc.nextDouble();
            
            System.out.print("La etiqueta es roja? (S/N): ");
            String etiqueta = sc.next();
            
            if (etiqueta.equalsIgnoreCase("S")) {
                total += precio * 0.8;
            } else {
                total += precio;
            }
        }
        
        System.out.println("El total a pagar es: $" + total);
    }
}