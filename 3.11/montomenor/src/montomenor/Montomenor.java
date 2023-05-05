/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package montomenor;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class Montomenor {
    public static void main(String[] args) {
        double montoVenta, iva, totalPagar, cantidadPago, cambio, totalDineroCaja = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la venta: ");
        montoVenta = input.nextDouble();
        
        iva = montoVenta * 0.16;
        totalPagar = montoVenta + iva;
        
        System.out.println("El IVA es: " + iva);
        System.out.println("El total a pagar es: " + totalPagar);
        
        do {
            System.out.print("Ingrese la cantidad con la que paga el cliente: ");
            cantidadPago = input.nextDouble();
            if (cantidadPago < totalPagar) {
                System.out.println("La cantidad con la que paga el cliente no puede ser menor al total a pagar.");
            }
        } while (cantidadPago < totalPagar);
        
        cambio = cantidadPago - totalPagar;
        System.out.println("El cambio es: " + cambio);
        
        totalDineroCaja += totalPagar;
        
        System.out.println("El total de dinero en caja es: " + totalDineroCaja);
    }
}