/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadescuento;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Random;

public class TiendaDescuento {
    public static void main(String[] args) {
        double totalVentas = 0;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int colorBolita = random.nextInt(3);
          
            double totalCompra = 5 + random.nextInt(901);
            double montoPago = 0;
            switch (colorBolita) {
                case 0: // bolita roja
                    montoPago = totalCompra * 0.6;
                    break;
                case 1: // bolita amarilla
                    montoPago = totalCompra * 0.75;
                    break;
                case 2: // bolita blanca
                    montoPago = totalCompra;
                    break;
            }
            totalVentas += montoPago;
            System.out.printf("Cliente %d: Compra = %.2f, Bolita = %d, Pago = %.2f\n", i+1, totalCompra, colorBolita, montoPago);
        }
        System.out.printf("Total de Ventas: %.2f\n", totalVentas);
    }
}
