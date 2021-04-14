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
 * //03. Criar um programa que leia dois números L e R. O programa deve veriﬁcar
 * a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir na 
 * tela qual o maior: "Quadrado" ou "Circulo".

 */
public class Exercicio_03 {
    public static void main(String[] args) {
        System.out.println("Informe o lado do quadrado");
        Scanner sc = new Scanner(System.in);
        String ladoString = sc.next();
        Double lado = Double.parseDouble(ladoString);
        Double quadradoArea = Math.pow(lado, 2);
        
        System.out.println("Informe o raio do círculo");
        Scanner sc1 = new Scanner(System.in);
        String raioString = sc1.next();
        Double raio = Double.parseDouble(raioString);
        Double circuloArea = 3.14 * Math.pow(raio, 2);
        
        if (quadradoArea > circuloArea) {
            System.out.println("O quadrado é maior: " + quadradoArea);
        } else {
            System.out.println("O circulo é maior: " + circuloArea);
        }
    }  
}
