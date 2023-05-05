/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalVentas = 0;
        double totalIVA = 0;
        double totalPagado = 0;

        while (true) {
            System.out.println("Ingrese el monto de la venta: ");
            double montoVenta = input.nextDouble();
            double iva = montoVenta * 0.12;
            double totalPagar = montoVenta + iva;
            System.out.println("El IVA es: " + iva);
            System.out.println("El total a pagar es: " + totalPagar);

            System.out.println("Ingrese la cantidad con que paga el cliente: ");
            double cantidadPagada = input.nextDouble();
            double cambio = cantidadPagada - totalPagar;
            System.out.println("El cambio es: " + cambio);

            totalVentas += montoVenta;
            totalIVA += iva;
            totalPagado += totalPagar;

            System.out.println("¿Desea ingresar otra venta? (si/no): ");
            String respuesta = input.next();
            if (respuesta.equals("no")) {
                break;
            }
        }

        System.out.println("El total de ventas es: " + totalVentas);
        System.out.println("El total del IVA es: " + totalIVA);
        System.out.println("El total pagado es: " + totalPagado);
    }
}