
/**
 *
 * @author Ambiente 209-1
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercados;

/**
 *
 * @author Ambiente 209-1
 */
       import java.util.Scanner;

public class SupermercadoS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;
        boolean continuarComprando = true;
        while (continuarComprando) {
            System.out.println("Ingrese el precio del artículo: ");
            double precio = scanner.nextDouble();
            System.out.println("Ingrese la cantidad de artículos iguales que ha tomado: ");
            int cantidad = scanner.nextInt();
            double gasto = precio * cantidad;
            totalCompra += gasto;
            System.out.println("Gastará en este artículo: $" + gasto);
            System.out.println("Total de la compra hasta ahora: $" + totalCompra);
            System.out.println("¿Desea seguir comprando? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equals("n")) {
                continuarComprando = false;
            }
        }
        System.out.println("Total de la compra: $" + totalCompra);
    }
}
        
    
