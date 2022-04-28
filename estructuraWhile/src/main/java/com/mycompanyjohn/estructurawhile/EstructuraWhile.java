/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyjohn.estructurawhile;

import java.util.Scanner;
public class EstructuraWhile {
    private Scanner teclado;
    private float[]alturas;
    private float promedio;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        alturas=new float[5];
        for(int f=0; f<5;f++){
            System.out.print("Ingrese la altura de la persona:  ");
            alturas[f]= teclado.nextFloat();
        }
    }
    public void calcularPromedio(){
        float suma;
        suma=0;
        for(int f=0;f<5;f++){
            suma=suma+alturas[f];
        }
        promedio=suma/5;
        System.out.println("Promedio de alturas: "+promedio);
    }
    public void menoresMayores(){
        int mayor,menor;
        mayor=0;
        menor=0;
        for(int f=0;f<5;f++){
            if(alturas[f]>promedio){
                mayor++;
            }else{
                if(alturas[f]<promedio){
                    menor++;
                }
            }
        }
        System.out.println("la cantidad de personas mas altas del promedio son: "+mayor);
        System.out.println("la cantidad de personas mas bajas al promedio son: "+menor);
    }
    
    
    public static void  main (String[] ar) {
        EstructuraWhile pv=new EstructuraWhile();
        pv.cargar();
        pv.calcularPromedio();
        pv.menoresMayores();
        }
            
            
    }

