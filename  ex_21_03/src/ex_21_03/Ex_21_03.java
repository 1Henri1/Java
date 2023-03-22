package ex_21_03;

import java.util.Scanner;

public class Ex_21_03 {


    public static void main(String[] args) {
        
       /*
        Exercicio 1
        int cont=100;
       
       while(cont<=200){
           
           if(cont % 2 != 0){
               System.out.println(cont + " é impar");
           }
            cont++;
    }*/
       
       /*
       Exercicio 2
       int cont = 100;
               
       while(cont >= 0){
           System.out.println(cont);
           cont--;
       }
       
       Exercicio 3*/
       
       /*

       int op = 0, cont = 0;
       double med, idade = 0, idadeTotal = 0;
       
       Scanner grava = new Scanner(System.in);
       
       do{
            System.out.println("1 - Colocar a idade");
            System.out.println("0 - Sair");
            op = grava.nextInt();
            if(op == 1){
            System.out.println("Digite sua idade: ");
            idade = grava.nextInt();
            idadeTotal = idadeTotal + idade;
            cont++;
            }
            }while(op != 0);
       med = idadeTotal/cont;
       System.out.format("A média das idades é: %.2f",med);
       */
       
        /*
       int quantVezes, cont = 1;
       double med, idade = 0, idadeTotal = 0;
       
       Scanner grava = new Scanner(System.in);
       System.out.println("Quantos alunos?");
       quantVezes = grava.nextInt();
       
       while(cont <= quantVezes){
           System.out.println("Digite sua idade: ");
            idade = grava.nextInt();
            idadeTotal = idadeTotal + idade;
            cont++;
       }
       med = idadeTotal/quantVezes;
       System.out.format("A média das idades é: %.2f",med);
       
      
       EXERCICIO 4
      
       int quantVezes, cont = 1;
       
       Scanner grava = new Scanner(System.in);
       System.out.println("Quantas vezes deve repetir?");
       quantVezes = grava.nextInt();
       
       while(cont <= quantVezes){
           cont++;
           System.out.println("Isso é um teste");
       }*/
       /*
       int cont = 0, total = 0;
       
       while(cont<1000){
       cont++;
       total = total+ cont;
       
       
       }
       System.out.println(total);
       */
       Scanner grava = new Scanner(System.in);
       int n1 = 0, n2 = 0, n3 = 0;
       int maior = 0, meio = 0, menor = 0;
       
       System.out.println("Primeiro número?");
       n1 = grava.nextInt();
       System.out.println("Segundo número?");
       n2 = grava.nextInt();
       System.out.println("Terceiro número?");
       n3 = grava.nextInt();
       
       
       if( n1 > n2 ){
           if(n2 > n3){
               maior = n1;
               meio = n2;
               menor = n3;
           } else {
               maior = n1;
               meio = n3;
               menor = n2;
           }
       }else if(n2 > n3){
           if(n1 > n3){
               maior = n2;
               meio = n1;
               menor = n3;
           } else {
               maior = n2;
               meio = n3;
               menor = n1;
           }
           
       }else {
           maior = n3;
           meio = n2;
           menor = n1;
       }
       
       System.out.println("o menor valor é "+menor +"\no valor do meio é " + meio+"\no maior valor é " + maior);
       
    }
     
}