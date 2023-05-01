import java.util.*;
public class maiorPosicao {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
    double maiorNumero= 0; int cont =0;

        //criação de vetor e adicionando dados.
      System.out.print("Quantos numeros você vai digitar? ");
      int n = tc.nextInt();
      double numeros[] = new double[n];
      for(int i=0; i <n; i++){
         System.out.print("Digite um numero: ");
         numeros[i] = tc.nextDouble();
}
             tc.close();
      
          //maior numero e posição
          for(int i=0; i <n; i++){
          if (maiorNumero <= numeros[i] && maiorNumero != numeros[i]){
          maiorNumero = numeros[i];    
           cont = i;
}
}    
     System.out.printf("MAIOR VALOR: %.2f ", maiorNumero);
     System.out.println("POSIÇÃO DO MAIOR VALOR: " + cont);
}
}

