package br.com.curso.rs;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador;

        System.out.println("digite o número da tabuada que deseja:");
        numero = scan.nextInt();
        System.out.println("quantas vezes quer? ");
        contador = scan.nextInt();
        System.out.println("tabuada de " + numero + "\n");

        for (int i = 1;i <= contador ; i++ ){
            System.out.println(numero + " x " + i + " = " + (numero * i) );
        }
    }
}
