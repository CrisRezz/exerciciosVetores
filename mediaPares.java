import java.util.*;
public class mediaPares {
    public static void main(String[] args) {
     Scanner tc = new Scanner(System.in);
        
     System.out.print("Quantos elementos vai ter o vetor? ");
     int n = tc.nextInt();
     int vetor[] = new int[n];
  
     for(int i =0; i<n; i++){
    System.out.print("Digite um numero: "); 
     vetor[i] = tc.nextInt();
}
       
      //MEDIA DOS PARES
      double soma =0;
      int ndepares=0;
for( int i =0; i <n; i++){
  if (vetor[i] % 2 ==0) {   
      soma +=vetor[i];
       ndepares ++;}
  }


       //RESULTADO
if(ndepares == 0){
      System.out.println("NENHUM NUMERO PAR");
}else{
  System.out.printf("MÉDIA DOS PARES = %.1f", soma /n);    
}
}
}

