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
public class Exercicio_08 {
    public static void main(String[] args) {
        System.out.println("Digite a hora de inicio do jogo");
        Scanner sc1 = new Scanner (System.in);
        String stringInicio = sc1.next();
        int inicio = Integer.parseInt(stringInicio);
        System.out.println("Digite a hora de término do jogo");
        Scanner sc2 = new Scanner (System.in);
        String stringTermino = sc2.next();
        int termino = Integer.parseInt(stringTermino);
        int tempo;
        if(inicio < termino) {
            tempo = termino - inicio;
        } else {
            tempo = (24 - inicio) + termino;
        } 
        System.out.printf("O tempo do jogo foi de %d horas", tempo);      
    }  
}
