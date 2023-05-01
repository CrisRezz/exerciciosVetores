import java.util.*;

public class alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tc = new Scanner (System.in);
    
        double total = 0, media = 0, count =0;

//Criando vetores  
         System.out.print("Quantas pessoas serão digitadas? ");
         int n = tc.nextInt();
         String[] vectname = new String[n];
         int[] vectage = new int[n];
         double[] vecthigh = new double[n];
        
//adicionando dados aos vetores
         for (int i=0; i<n; i++) {
         System.out.println("Digite os dados da "+(i+1)+"a pessoa: ");
         System.out.print("Nome: ");
         vectname[i] = tc.next(); 
         System.out.print("Idade: ");
         vectage[i] = tc.nextInt();
         System.out.print("Altura: ");
         vecthigh[i] = tc.nextDouble();
}
           tc.close();
           
//media das alturas
       for (int i=0; i<n; i++) {
       media += vecthigh[i];
       total = media / n;
}
       System.out.printf("%nAltura média: %.2f" , total);

//porcentagem
       for( int i =0; i<n; i++){
       if(vectage[i] < 16){
       count+=1;
}
}
       double percent = count * 100 / n;
       System.out.printf( "%nPessoas com menos de 16 anos: %.1f%%", percent );

//nome de quem tem menos de 16 anos
                System.out.println();
                for( int i =0; i<n; i++){
                if(vectage[i] < 16){    
                System.out.println(vectname[i]);
}
}
}
}
