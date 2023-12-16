import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LimpadorDeTexto {

    private static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Olá, eu sou o limpador de texto!!!");

        String dirFile, fileName, newFileName;

        Scanner S = new Scanner(System.in);

        System.out.println("Onde está o arquivo que devo limpar?");
        dirFile = S.nextLine();

        System.out.println("Muito bom, entendi o arquivo está em: " + dirFile);

        System.out.println("Qual o nome do arquivo? Não se esqueça de colocar a extensão junto!");
        fileName = S.nextLine();

        System.out.println("Certo, o nome do arquivo é " + fileName);
        System.out.println("Agora me informe os caracteres que eu devo remover de todo o arquivo, separando as palavras por , ");

        String charsToRemove = S.nextLine();

        File arquivo = new File(dirFile + fileName);
        sc = new Scanner(arquivo);

        StringBuilder novoConteudo = new StringBuilder();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
            novoConteudo.append(removerCaracteres(linha, charsToRemove)).append("\n");
        }

        System.out.println("Digite o nome do novo arquivo:");
        newFileName = S.nextLine();
        try (PrintWriter writer = new PrintWriter(new File(dirFile + newFileName))) {
            writer.print(novoConteudo.toString());
            System.out.println("Conteúdo limpo salvo no arquivo: " + newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            S.close();
            sc.close();
        }
    }

   
    private static String removerCaracteres(String linha, String caracteresRemover) {
        return linha.replaceAll("[" + caracteresRemover + "]", "");
    }
}
