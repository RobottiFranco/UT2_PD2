package com.example;

/**
 * Hello world!
 */
public final class ejercicio1 {
    public static int factorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return factorial(numero - 1) * numero;
        }
    }

    public static void main(String[] args) {
        System.out.println("factorial de 5");
        System.out.println(factorial(5));

        System.out.println("factorial de 4");
        System.out.println(factorial(4));

        System.out.println("factorial de 0");
        System.out.println(factorial(0));

    }
}
