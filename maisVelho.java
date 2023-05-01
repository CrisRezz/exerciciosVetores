import java.util.*;
public class maisVelho {
public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
    int maisvelho = 0;
    String nomemaisvelho ="";

    //criando vetores
    System.out.print("Quantas pessoas você vai digitar?: ");
    int qtd = tc.nextInt();
    String pessoanome[] = new String[qtd];
    int pessoaidade[] = new int[qtd];

     //Adicionando dados
    for(int i = 0 ; i <qtd; i++){
    System.out.println("Dados da " +(i+1)+ "° pessoa:");
    System.out.print("Nome: ");
    pessoanome[i] = tc.next();
    System.out.print("Idade: ");
     pessoaidade[i] = tc.nextInt();
    }

    for(int i=0; i <qtd; i++){
        if (maisvelho <= pessoaidade[i] && maisvelho != pessoaidade[i]){
        maisvelho = pessoaidade[i];  
        nomemaisvelho = pessoanome[i];
        }
    }

    System.out.println("PESSOA MAIS VELHA: " + nomemaisvelho);
}    
}