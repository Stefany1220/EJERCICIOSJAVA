/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroventas;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalClientes = 0;
        double totalVentas = 0;

        System.out.print("Ingrese el número de clientes atendidos: ");
        int numClientes = input.nextInt();

        for (int i = 1; i <= numClientes; i++) {
            System.out.printf("Ingrese el monto total de la compra del cliente %d: $", i);
            double montoCompra = input.nextDouble();
            totalVentas += montoCompra;
            totalClientes++;
        }

        System.out.printf("La cantidad total de ventas del día fue: $%.2f%n", totalVentas);
        System.out.printf("El número total de clientes atendidos fue: %d%n", totalClientes);
    }
}