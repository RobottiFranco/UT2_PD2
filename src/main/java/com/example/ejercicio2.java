package com.example;

public class ejercicio2 {

    public static int SumaLineal(int[] A, int n) {
        if (n == 1) {
            return A[0];
        } else {
            return SumaLineal(A, n - 1) + A[n - 1];
        }
    }

    public static void main(String[] args) {
        int[] A = { 4, 3, 6, 2, 5 };
        int n = 5;

        System.out.println(SumaLineal(A, n));

        /*
         * n = -2;
         * System.out.println(SumaLineal(A, n));
         *
         * Nunca se llega al caso base
         */

        /*
         * int[] B = {};
         * System.out.println(SumaLineal(B, n));
         *
         * ocurre el fallo: java.lang.ArrayIndexOutOfBoundsException
         */

    }
}
