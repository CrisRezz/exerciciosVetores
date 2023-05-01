import java.util.*;
public class numerosPares {

public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
      
    //criação de vetor e adicionando dados.
  System.out.print("Quantos numeros você vai digitar? ");
  int n = tc.nextInt();
  int numeros[] = new int[n];
  for(int i=0; i <n; i++){
     System.out.print("Digite um numero: ");
     numeros[i] = tc.nextInt();
  }
         tc.close();
     
          //lista de numeros pares
          int count = 0;
          System.out.print("NUMEROS PARES: ");
          for( int i =0; i <n; i++){
            if (numeros[i] % 2 ==0) {
                System.out.print(numeros[i] + " ");
                count +=1;
            }
          }
           //Quantida de pares
           System.out.println("\nQUANTIDADE DE PARES: "+ count);

}

    
}
