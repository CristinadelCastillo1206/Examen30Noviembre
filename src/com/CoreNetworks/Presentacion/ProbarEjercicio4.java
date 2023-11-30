package com.CoreNetworks.Presentacion;

public class ProbarEjercicio4 {
    public static void main(String[] args) {

        // Encontrar el numero mayor y el numero menor de una serie de numeros definidos en un array


        int[] num = {-2, 4, 45, -7, 3, -2, 8, -31, 5, 8, 23, -6, -19, 23, 45, 7, 12, -12};

        int numeroMenor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < numeroMenor) {
                numeroMenor =num[i];

            }

            System.out.println("El numero mas pequeño es: " +numeroMenor);

            int numeroAlto =num[0];
            for (int i1 = 0; i < num.length; i++) {
                if (num[i] > numeroAlto) {
                    numeroAlto = num[i];

                }

                }
            System.out.println("El numero mas alto es: " +numeroAlto);



            }
    }
}
