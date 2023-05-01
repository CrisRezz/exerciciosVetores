import java.util.*;
public class abaixo_da_media {
    public static void main(String[] args) {
     Scanner tc = new Scanner(System.in);
     double soma = 0;

//criando vetores
       System.out.print("Quantos elementos vai ter o vetor?:  ");
       int n = tc.nextInt();
       double numeros[] = new double[n];
     for(int i=0; i <n; i++){
     System.out.print("Digite um numero: ");
     numeros[i] = tc.nextDouble();
     soma += numeros[i];
}
      tc.close();

//media
double media = soma/n;
System.out.printf("MEDIA DO VETOR =  %.3f" , media);
System.out.println();

//Numeros abaixo da média
  System.out.print("ELEMENTOS ABAIXO DA MÉDIA: ");     
    for (int i =0; i<n; i++){
    if (numeros[i] < media){
    System.out.printf("%.1f ", numeros[i]);
}
}
} 
}
