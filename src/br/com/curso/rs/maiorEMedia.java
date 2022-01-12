package br.com.curso.rs;

import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        double soma = 0;
        do{
            System.out.println("digite um número: ");
            numero = scan.nextInt();
            count = count + 1;
            soma = soma + numero;

            if (numero > maior) maior = numero;
        }while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("media: " + (soma / 5));
    }

}
