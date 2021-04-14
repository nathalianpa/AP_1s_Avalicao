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
 * //01. Criar um programa que leia o nome de um vendedor, o seu salário ﬁxo e o 
 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e 
 * imprimir o total a receber no ﬁnal do mês.
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        System.out.println("Qual é o seu nome?");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        
        System.out.println("Qual é o seu salário?");
        Scanner sc1 = new Scanner(System.in);
        String salarioString = sc1.next();
        Double salario = Double.parseDouble(salarioString);
        
        System.out.println("Qual é o seu total de vendas efetuadas no mês (em dinheiro)?");
        Scanner sc2 = new Scanner(System.in);
        String vendasString = sc2.next();
        Double vendas = Double.parseDouble(vendasString);
        
        Double comissao = vendas * 0.15;
        Double total = salario + comissao;
        System.out.println("O total a receber é: " + total);
    }
}
