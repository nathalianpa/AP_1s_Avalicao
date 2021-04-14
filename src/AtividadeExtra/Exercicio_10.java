/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeExtra;

import java.util.Scanner;

/**
 *
 * @author Nathalia
 */
public class Exercicio_10 {
    public static void main(String[] args) {
        System.out.println("Nota 1");
        Scanner sc1 = new Scanner (System.in);
        String stringNota1 = sc1.next();
        double nota1 = Double.parseDouble(stringNota1);
        System.out.println("Nota 2");
        Scanner sc2 = new Scanner (System.in);
        String stringNota2 = sc1.next();
        double nota2 = Double.parseDouble(stringNota2);
        System.out.println("Nota 3");
        Scanner sc3 = new Scanner (System.in);
        String stringNota3 = sc1.next();
        double nota3 = Double.parseDouble(stringNota3);
        double media = (nota1 + nota2  + nota3) / 3;
        Scanner sc4;
        String stringExame;
        double exame;
        double mediaExame;
        if(media >= 7) {
            System.out.printf("Sua nota é %.02f. Aprovado!", media);
        } else {
            System.out.println("Informe a nota do Exame");
            sc4 = new Scanner (System.in);
            stringExame = sc1.next();
            exame = Double.parseDouble(stringExame);
            mediaExame = (media + exame) / 2;
            if(mediaExame >= 5) {
            System.out.printf("Sua nota é %.02f. Aprovado em exame!", mediaExame);
            } else {
                System.out.printf("Sua nota é %.02f. Reprovado!", mediaExame);
            }
        }
    }
    
}
