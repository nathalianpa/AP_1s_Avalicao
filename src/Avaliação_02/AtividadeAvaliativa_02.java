/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avaliação_02;

import java.util.Scanner;

/**
 *
 * @author 
 * Nathalia Pereira Alves
 * Patricia Faustino Ferreira
 * 
 */
public class AtividadeAvaliativa_02 {
    public static void main(String[] args) {
        boolean repetir = true;
        String[] nomes = new String[50];
        int posicao = 0;
        int quantidade = 0;
        
        while(repetir) {
            System.out.println("");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("");
            System.out.println("1 - Adicionar um novo nome");
            System.out.println("2 - Apresentar os nomes");
            System.out.println("3 - Pesquisar um nome");
            System.out.println("4 - Remover um nome");
            System.out.println("0 - Sair");

            Scanner sc = new Scanner(System.in);
            String resultado = sc.next();

            menu:
            switch (resultado){
                case "1":
                    if(quantidade >= nomes.length) {
                        System.out.println("Já possui " + nomes.length + " nomes.");
                        break menu;
                    }

                    System.out.println("Insira um nome:");
                    Scanner sc1 = new Scanner(System.in);
                    String nome = sc1.next();
                    
                    for(int i = 0; i < quantidade; i++) {                        
                        if(nomes[i].equals(nome)) {
                            System.out.println("O nome já existe na lista.");
                            break menu;
                        }        
                    }
         
                    nomes[posicao] = nome;
                    posicao = posicao + 1;
                    quantidade = quantidade + 1;
                    
                    break;
                case "2":
                    if(quantidade == 0) {
                        System.out.println("A lista de nomes está vazia.");
                        break menu;
                    }
                    
                    for(int i = 0; i < quantidade; i++) {
                        System.out.println("" + nomes[i]);
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome que deseja pesquisar:");
                    Scanner sc3 = new Scanner(System.in);
                    String pesquisa = sc3.next();
                    
                    for(int i = 0; i < quantidade; i++) {

                        if(nomes[i].equals(pesquisa)) {
                            System.out.println("O nome foi encontrado, e está na posição: " + i);
                            break menu;
                        }
                    } 
                    
                    System.out.println("O nome não foi encontrado.");
                    
                    break;
                case "4":
                    System.out.println("Insira o nome deseja remover:");
                    Scanner sc4 = new Scanner(System.in);
                    String deletado = sc4.next();
                    
                    for(int i = 0; i < quantidade; i++) {
                        if(nomes[i].equals(deletado)) {                                                                                
                            for(int j = i; j < quantidade; j++) {
                                if(j == quantidade - 1) {
                                    nomes[j] = null;
                                } else {
                                    nomes[j] = nomes[j + 1];                                   
                                }                                                                           
                            }
                            
                            posicao = posicao - 1;
                            quantidade = quantidade - 1;
                            System.out.println("O nome foi removido.");
                            
                            break menu;
                        }
                    }
                    
                    System.out.println("Nome não encontrado.");
          
                    break;
                case "0":
                    repetir = false;
                    break;
                default: 
                    System.out.println("Opção inválida.");
            }
            
        }

    }  
}
