package ex_21_03;

import java.util.Scanner;

public class Ex_21_03 {


    public static void main(String[] args) {
        
       /*
        Exercicio 1
        int cont=100;
       
       while(cont<200){
           cont++;
           if(cont % 2 != 0){
               System.out.println(cont);
           }
    }*/
       
       /*
       Exercicio 2
       int cont = 100;
               
       while(cont >= 0){
           System.out.println(cont);
           cont--;
       }*/
       /* 
       Exercicio 3

       int op = 0, idade = 0, idadeTotal = 0, cont = 0;
       double med;
       
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
       System.out.println("A média das idades é: "+med);*/
       
       int quantVezes = 0, cont = 1;
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
       
       /*
       EXERCICIO 4
      
       int quantVezes = 0, cont = 1;
       
       Scanner grava = new Scanner(System.in);
       System.out.println("Quantas vezes deve repetir?");
       quantVezes = grava.nextInt();
       
       while(cont <= quantVezes){
           cont++;
           System.out.println("Isso é um teste");
       }*/
       
       
       
    }
     
}