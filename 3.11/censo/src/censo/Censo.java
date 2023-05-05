/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package censo;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class Censo {
    public static void main(String[] args) {
        int numeroCenso, edad;
        String sexo, estadoCivil;
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Ingrese los datos de la tarjeta " + i + ":");
            System.out.print("Número de censo: ");
            numeroCenso = input.nextInt();
            input.nextLine();
            System.out.print("Sexo (F/M): ");
            sexo = input.nextLine();
            System.out.print("Edad: ");
            edad = input.nextInt();
            input.nextLine();
            System.out.print("Estado civil (a.- soltero, b.- casado, c.- viudo, d.- divorciado): ");
            estadoCivil = input.nextLine();
            
            if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("a") && edad >= 16 && edad <= 21) {
                System.out.println("Joven soltera encontrada:");
                System.out.println("Número de censo: " + numeroCenso);
                
            }
        }
    }
}