/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package masaaireneumaticos;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class MasaAireNeumaticos {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n, tipoVehiculo;
      double presion, temperatura, volumen, masa, sumaMasas = 0;
      final double CONSTANTE = 0.37 * 10;

      System.out.print("Ingrese el número de vehículos en compostura: ");
      n = sc.nextInt();

      for (int i = 1; i <= n; i++) {
         System.out.println("Vehículo #" + i);
         System.out.print("Tipo de vehículo (1-motocicleta, 2-automóvil): ");
         tipoVehiculo = sc.nextInt();

          switch (tipoVehiculo) {
              case 1:
                  System.out.print("Ingrese la presión del neumático de la motocicleta en PSI: ");
                  presion = sc.nextDouble();
                  System.out.print("Ingrese la temperatura del neumático de la motocicleta en °F: ");
                  temperatura = sc.nextDouble();
                  volumen = 0.01; 
                  masa = presion * CONSTANTE / (temperatura + 460);
                  sumaMasas += masa;
                  break;
              case 2:
                  System.out.print("Ingrese la presión del neumático del automóvil en PSI: ");
                  presion = sc.nextDouble();
                  System.out.print("Ingrese la temperatura del neumático del automóvil en °F: ");
                  temperatura = sc.nextDouble();
                  volumen = 0.04; 
                  masa = presion * CONSTANTE / (temperatura + 460);
                  sumaMasas += masa;
                  break;
              default:
                  System.out.println("Tipo de vehículo no válido");
                  i--;
                  break;
          }
      }

      double promedioMasas = sumaMasas / n;
      System.out.printf("El promedio de masa de aire de los neumáticos de los %d vehículos es %.2f libras.\n", n, promedioMasas);
   }
}
    

