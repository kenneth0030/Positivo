/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivo;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class Positivo {

    float numero;
    Scanner entrada = new Scanner(System.in);

    public void entradas() {
        System.out.println("introduzca un numero real");
        numero = entrada.nextFloat();

        if (numero > 0) {
            System.out.println(numero + " es mayor que 0");
        }

    }

    public static void main(String[] args) {
        Positivo op = new Positivo();
        op.entradas();
    }

}
