package com.CoreNetworks.Presentacion;

import java.util.Scanner;

public class ProbarEjercicio3 {
    public static void main(String[] args) {
        //3.Mostrar en base a un numero, una descripcion

        Scanner gamaCoches = new Scanner(System.in);
        System.out.println("Escriba un numero del 1 al 8");

        int descripcion = 0;

        descripcion = gamaCoches.nextInt();

        switch (descripcion) {

            case 1:
                System.out.println("Para microcoche");
                break;

            case 2:
                System.out.println("Para automoviles compactos");
                break;

            case 3:
                System.out.println("Para automoviles ultracompacto");
                break;

            case 4:
                System.out.println("Para automovil familiar");
                break;

            case 5:
                System.out.println("Para vehiculo de lujo");
                break;

            case 6:
                System.out.println("Para automovil deportivo");
                break;

            case 7:
                System.out.println("Para descapotable");
                break;

            case 8:
                System.out.println("Para todoterreno");
                break;

            default:
                System.out.println("Mostrar el numero 9");
                gamaCoches.close();


        }
    }
}
