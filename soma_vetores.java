import java.util.*;
public class soma_vetores {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);

    //criação de vetores e adiocionando dados.
    System.out.print("Quantos valores vai ter o vetor?: ");
    int n = tc.nextInt();
    System.out.println("Digite os valores do vetor A: ");
    int vetorA[] = new int[n];
    for(int i=0; i <n; i++){
       vetorA[i] = tc.nextInt();
}
    System.out.println("Digite os valores do vetor B: ");
    int vetorB[] = new int[n];
    for(int i=0; i <n; i++){
       vetorB[i] = tc.nextInt();
}
tc.close();

//vetorC, somando os dois vetores.
System.out.println("VETOR RESULTANTE: ");
int vetorC[] = new int[n];
for(int i=0; i <n; i++){
vetorC[i] = vetorA[i] + vetorB[i];
System.out.println(vetorC[i]);
}
}
}
