/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliação_01;

import java.util.Scanner;

/**
 *
 * @author Nathalia Pereira Alves | Patricia Faustino Ferreira
 * 
 * //02.  Criar um programa que leia três números inteiros e apresente na tela o
 * maior deles.

 */
public class Exercicio_02 {
    public static void main(String[] args) {
        System.out.println("Cite o primeiro número inteiro");
        Scanner sc = new Scanner(System.in);
        String numero1String = sc.next();
        int numero1 = Integer.parseInt(numero1String);
        
        System.out.println("Cite o segundo número inteiro");
        Scanner sc1 = new Scanner(System.in);
        String numero2String = sc.next();
        int numero2 = Integer.parseInt(numero2String);
        
        System.out.println("Cite o terceiro número inteiro");
        Scanner sc2 = new Scanner(System.in);
        String numero3String = sc.next();
        int numero3 = Integer.parseInt(numero3String);
        
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("O primeiro número escolhido é o maior de todos: " + numero1);
                
            } else {
                System.out.println("O terceiro número escolhido é o maior de todos: " + numero3);   
            } 
        } else if(numero2 > numero3) {
            System.out.println("O segundo número escolhido é o maior de todos: " + numero2);
        } else {
            System.out.println("O terceiro número escolhido é o maior de todos: " + numero3);
        }
    }   
}
