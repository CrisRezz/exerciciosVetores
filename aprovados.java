import java.util.*;

public class aprovados {
    public static void main(String[] args) {
//criação de vetores
        Scanner tc = new Scanner(System.in);
         System.out.print("Quantos alunos serão digitados?: ");
        int qtd = tc.nextInt();
        String nomeAluno[] = new String[qtd];
        double nota1[] = new double[qtd];
        double nota2[] = new double[qtd]; 
        
//adicionando dados aos vetores
        for(int i = 0; i <qtd ; i++){
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"° aluno ");
            tc.nextLine();
            nomeAluno[i] = tc.nextLine();
            nota1[i]=tc.nextDouble();
            nota2[i] = tc.nextDouble();
}

//media das notas e listagem de alunos aprovados
          System.out.println("Alunos aprovados: ");
          for(int i = 0; i<qtd ; i++){
          if((nota1[i] + nota2[i]) / 2 >= 6){
          System.out.println(nomeAluno[i]);
            
            }            
}
        
}
}