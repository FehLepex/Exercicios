import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + " vamos calcular suas despesas!");

        System.out.println("Qual mês estamos calculando?");
        String mes = sc.nextLine();

        System.out.println("Quantas despesas temos em " + mes);
        byte despesas = sc.nextByte();

        byte nmrDespesas = 1;
        int despesasTotais = 0;

        while (nmrDespesas <= despesas) {
            System.out.println("Informe o valor da " + nmrDespesas + "ª despesa");
            int vlrDespesa = sc.nextInt();

            despesasTotais += vlrDespesa;
            nmrDespesas++;
        }

        System.out.println("O valor total das despesas do mês é: " + despesasTotais);
        
        System.out.println("Quanto você ganhou esse mês?");
        int salario = sc.nextInt();

        int sobra = salario - despesasTotais;
        
        if (salario > despesasTotais) {
            System.out.println("Você consegue pagar as contas e ainda irá sobrar R$" + sobra);
        } else {
            System.out.println("Você vai precisar pendurar essa dívida para o próximo mês. Faltou R$" + sobra*-1);
        }
        sc.close();
    } 
}
