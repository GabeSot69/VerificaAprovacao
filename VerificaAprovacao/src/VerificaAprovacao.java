/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Desenvolva um programa que leia a matrícula e a nota final de cada aluno de uma escola. Se a nota final
    for maior ou igual a 60, o programa deve exibir a mensagem “Aluno aprovado”, se for menor, exibir a mensagem
    "Aluno reprovado".
*/

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua matricula");
        String matricula = scanner.nextLine();
        System.out.println("Digite sua nota final");
        int notaFinal = scanner.nextInt();

        if (notaFinal >= 0 && notaFinal < 60) {
            System.out.println("Aluno reprovado");
        }
        else if (notaFinal <= 100){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Nota invalida");
        }
    }
}
