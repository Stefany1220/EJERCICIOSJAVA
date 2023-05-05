/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatrodescuentos;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class TeatroDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precioAsiento = 100;
        int totalPerdidoC1 = 0;
        int totalPerdidoC2 = 0;
        int totalPerdidoC3 = 0;
        int totalPerdidoC4 = 0;
        int totalPerdidoC5 = 0;
        System.out.println("Ingrese la cantidad de personas que asistirán al teatro: ");
        int cantidadPersonas = scanner.nextInt();
        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();
            if (edad < 5) {
                System.out.println("Lo siento, los niños menores de 5 años no pueden entrar al teatro.");
            } else {
                double descuento = 0;
                if (edad >= 5 && edad <= 14) {
                    descuento = 0.35;
                    totalPerdidoC1 += precioAsiento * descuento;
                } else if (edad >= 15 && edad <= 19) {
                    descuento = 0.25;
                    totalPerdidoC2 += precioAsiento * descuento;
                } else if (edad >= 20 && edad <= 45) {
                    descuento = 0.10;
                    totalPerdidoC3 += precioAsiento * descuento;
                } else if (edad >= 46 && edad <= 65) {
                    descuento = 0.25;
                    totalPerdidoC4 += precioAsiento * descuento;
                } else if (edad >= 66) {
                    descuento = 0.35;
                    totalPerdidoC5 += precioAsiento * descuento;
                }
                double precioConDescuento = precioAsiento - (precioAsiento * descuento);
                System.out.println("La persona " + i + " tiene " + edad + " años y tiene un descuento del " + (descuento*100) + "%. Precio del asiento: $" + precioConDescuento);
            }
        }
        System.out.println("Total perdido por categoría:");
        System.out.println("Categoría 1: $" + totalPerdidoC1);
        System.out.println("Categoría 2: $" + totalPerdidoC2);
        System.out.println("Categoría 3: $" + totalPerdidoC3);
        System.out.println("Categoría 4: $" + totalPerdidoC4);
        System.out.println("Categoría 5: $" + totalPerdidoC5);
    }
}
