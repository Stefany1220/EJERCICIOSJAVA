/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author Ambiente 209-1
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int num = 5;
        
        for (int i = 1; i <= 10; i++) {
            int producto = num * i;
            System.out.println(num + " x " + i + " = " + producto);
        }
    }
}