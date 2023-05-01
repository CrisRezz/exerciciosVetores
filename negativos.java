import java.util.Locale;
import java.util.Scanner;

public class negativos {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

     //criação de vetores
     System.out.print("Quantos numeros voce vai digitar? ");
     int n = sc.nextInt();

       int[] vect = new int[n];
       for (int i=0; i<n; i++) {
       System.out.print("Digite um numero: ");
       vect[i] = sc.nextInt();        
    }
       sc.close();
       
  //listagem de negativos
    System.out.print("Numeros negativos: ");
    for (int i=0; i<n; i++) {
        if (vect[i] <0) {
            System.out.print(vect[i] + " ");
      
        }      
     }
  
sc.close();
}
}


