import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
   
          double[] vect = new double[n];
          for (int i=0; i<n; i++) {
          System.out.print("Digite um numero: ");
          vect[i] = sc.nextDouble();        
       }

       System.out.print("VALORES: ");
       for (int i=0; i<n; i++) {
        System.out.print(vect[i]); 
       int v = n-1;
        if (i<v) {
            System.out.print(", ");
        } else {
        }  
       }

       double soma = 0;
       for (int i=0; i<n; i++) {
        soma = soma + vect[i]; 
       } 
       System.out.printf("%nSOMA: %.2f" , soma);
      
  
      double media;
      media = soma/n;
      System.out.printf("%nMÉDIA: %.2f" , media);
    }
}
