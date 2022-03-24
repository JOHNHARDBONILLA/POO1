/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyjohn.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author johnb
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.print("Ingrese el primer valor: ");
        num1= teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2= teclado.nextInt();
        if (num1>num2){
            int suma,diferencia;
            suma=num1 + num2;
            diferencia=num1 - num2;
           System.out.print("la suma de los valores es: ");
           System.out.println(suma);
           System.out.print("la diferencia de los valores es: ");
           System.out.println(diferencia);     
        }else{
            float producto,division;
            producto=num1 *num2;
            division= num1 /num2;
            System.out.print("el  producto de los valores es: ");
           System.out.println(producto);
           System.out.print("la division de los valores es: ");
           System.out.println(division);
           
        }
    }
}
