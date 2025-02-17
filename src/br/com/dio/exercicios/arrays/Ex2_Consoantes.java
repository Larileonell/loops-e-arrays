package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadesConsoantes = 0;
        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadesConsoantes++;
            }
            count++;
        } while (count < consoantes.length);
        for (String consoante : consoantes) {
            System.out.println(consoante);
        }
    }
}