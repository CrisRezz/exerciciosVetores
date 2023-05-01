import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //criação do vetor e adição de dados
          System.out.print("Quantos numeros voce vai digitar? ");
          int n = sc.nextInt();
          double[] vect = new double[n];
          for (int i=0; i<n; i++) {
          System.out.print("Digite um numero: ");
          vect[i] = sc.nextDouble();        
       }
             sc.close();

        //listagem dos valores
                System.out.print("VALORES: ");
                for (int i=0; i<n; i++) {
                System.out.print(vect[i]); 
                int v = n-1;
                if (i<v) 
                    System.out.print(", ");
        
       }
       //soma dos valores
                double soma = 0;
                for (int i=0; i<n; i++) {
                    soma = soma + vect[i]; 
                } 
                System.out.printf("%nSOMA: %.2f" , soma);
                
       //média dos valores
                double media;
                media = soma/n;
                System.out.printf("%nMÉDIA: %.2f" , media);
}
}
