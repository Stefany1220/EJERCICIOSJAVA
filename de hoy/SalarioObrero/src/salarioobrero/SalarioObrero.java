/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioobrero;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class SalarioObrero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        System.out.print("Ingrese el número de obreros: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Obrero #" + i);

            System.out.print("Ingrese el número de horas trabajadas: ");
            int horasTrabajadas = sc.nextInt();

            double sueldoBase = Math.min(horasTrabajadas, 40) * tarifa;
            double salarioHoraExtra = 0;
            int horasExtras = Math.max(horasTrabajadas - 40, 0);

            if (horasExtras <= 8) {
                salarioHoraExtra = horasExtras * tarifa * 2;
            } else {
                salarioHoraExtra = 8 * tarifa * 2 + (horasExtras - 8) * tarifa * 3;
            }

            double salarioSemanal = sueldoBase + salarioHoraExtra;
            System.out.println("El salario semanal del obrero es: " + salarioSemanal);
            System.out.println();
        }
    }
}