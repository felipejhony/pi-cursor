package com.felipe.mathpi.gen;

public class ManualGen {

    public void run(int digitos){
        // Divisao de pi
        long numerador = 355;
        long denominador = 113;

        //quantidade de numeros

        System.out.print(numerador / denominador + "."); // Parte inteira
        long resto = numerador % denominador;

        for (int i = 0; i < digitos; i++) {
            resto *= 10;
            System.out.print(resto / denominador);
            resto %= denominador;
        }
    }
}
