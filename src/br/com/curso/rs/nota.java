package br.com.curso.rs;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("informe a nota: ");
         nota = scan.nextDouble();
      if (nota < 10 ){
      System.out.println("A nota informada é válida.");

         }
      while (nota < 0 | nota > 10){
          System.out.println("Desculpe, o número " + nota + " é inválido, digite um número de 0 a 10:");
          nota = scan.nextDouble();
          if (nota < 10 | nota > 0) System.out.println("A nota informada é válida.");

          }

      }

    }

