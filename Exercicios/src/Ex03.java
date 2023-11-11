import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos começar, Paula.");

        System.out.print("Qual o dia de hoje? ");
        int diaAtual = scanner.nextInt();

        System.out.print("Qual mês estamos? ");
        int mesAtual = scanner.nextInt();

        System.out.print("De qual ano? ");
        int anoAtual = scanner.nextInt();

        System.out.println("Beleza Paula, e há quanto tempo aconteceu o fato que está na sua cabeça?");

        System.out.print("Informe quantos anos tem o acontecimento (informar valores inteiros apenas): ");
        int anosPassados = scanner.nextInt();

        System.out.print("Informe quantos meses ocorreu o acontecimento (informar valores inteiros apenas): ");
        int mesesPassados = scanner.nextInt();

        System.out.print("Informe quantos dias (informar valores inteiros apenas): ");
        int diasPassados = scanner.nextInt();

        
        int diaFato = diaAtual - diasPassados;
        int mesFato = mesAtual - mesesPassados;
        int anoFato = anoAtual - anosPassados;

        
        while (diaFato <= 0) {
            diaFato += diasNoMes(mesFato, anoFato);
            mesFato--;
        }

        while (mesFato <= 0) {
            mesFato += 12;
            anoFato--;
        }

        System.out.println("Muito bom, então sendo hoje " + diaAtual + "/" + mesAtual + "/" + anoAtual +
                " e o fato aconteceu há " + anosPassados + " anos, " + mesesPassados + " meses e " + diasPassados +
                " dias... Calculando");

        System.out.println("O fato aconteceu na data " + diaFato + "/" + mesFato + "/" + anoFato);

        scanner.close();
    }

 
    private static int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

       
        return diasPorMes[mes];
    }
}
