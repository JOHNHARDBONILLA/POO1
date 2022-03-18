/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyjohn.mavenproject2;

import java.util.Scanner;


public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Ingrese la cantidad de horas trabajadas:");
        horasTrabajadas=teclado.nextInt();
        System.out.print("ingrese el valor de hora trabajada: ");
        costoHora=teclado.nextFloat();
        sueldo=horasTrabajadas * costoHora;
        System.out.print("el sueldoa pagar es: ");
        System.out.println(sueldo);
    }
}
