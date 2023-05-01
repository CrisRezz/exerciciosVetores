import java.util.*;
public class dadosPessoas {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double menorAltura, maiorAltura ,mediamulheres=0;
        int qtdH =0 , qtdM =0;

//qtd de vetores
    System.out.print("Quantas pessoas serão digitadas?: ");
    int qtd = tc.nextInt();
  
//criando vetores
        double altura[] = new double[qtd];
        char genero[] = new char[qtd];
      
//adicionando dados aos vetores
      for ( int i = 0; i <qtd ; i++){
      System.out.print("Qual a altura da " +(i+1) + "° pessoa?: ");
      altura[i] = tc.nextDouble();
      System.out.print("Qual o genero da " + (i+1)+ "° pessoa?: ");
      genero[i] = tc.next().charAt(0);      
}
 tc.close();

//maior e menor altura
menorAltura = altura[0];
maiorAltura = altura[0];
         for (int i = 0; i <qtd; i++){
         if (menorAltura > altura[i]){
            menorAltura = altura[i];
}        if (maiorAltura < altura[i]){
            maiorAltura = altura[i];
}
}
//qtd de homens e altura media das mulheres
        for(int i = 0 ; i  <qtd ; i++){
              if( genero[i] == 'M' ||  genero[i] == 'm'){
                   qtdH ++;
}             else{
                   qtdM ++;
                   mediamulheres += altura[i];
}
}
  mediamulheres = mediamulheres / qtdM;

//resultados
System.out.println("Menor altura: " + menorAltura);
System.out.println("Maior altura: " + maiorAltura);

if(mediamulheres > 0){
System.out.printf("Média das alturas das mulheres: %.2f %n" , mediamulheres);
}else{
    System.out.println("Não há mulheres para calcular a média de altura!");
}
System.out.println("Numero de Homens: " + qtdH);

}
}