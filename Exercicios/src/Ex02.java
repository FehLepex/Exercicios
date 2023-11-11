import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("E ai, Bruno. Temos que ordenar alguns nomes, certo?");
		System.out.println("Quantos Alunos tem nessa turma?");
		int Alunos = sc.nextInt();
		
		sc.nextLine();
		
		String[] NomeDosAlunos = new String[Alunos];
		
		for(int i = 0 ; i < Alunos; i++ ) {
			System.out.println("digite o nome do aluno" + (i + 1) + ": ");
			NomeDosAlunos[i]= sc.nextLine();
			
	
		}
		
		
        for (int i = 1; i < Alunos; i++) {
            String atual = NomeDosAlunos[i];
            int j = i - 1;

           
            while (j >= 0 && NomeDosAlunos[j].length() < atual.length()) {
                NomeDosAlunos[j + 1] = NomeDosAlunos[j];
                j--;
            }

           
            NomeDosAlunos[j + 1] = atual;
        }


        System.out.println("Segue a Lista da Chamada ordenada");
        for (String nome : NomeDosAlunos) {
            System.out.println(nome);
        }
        	sc.close();
    }
}