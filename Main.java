import java.io.*;

public class Main {
    public static void EscritaDeArquivo() {
        String conteudo = "Olá, este é um exemplo de escrita em um arquivo!\nEsta é a segunda linha.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exemplo.txt"))) {
            writer.write(conteudo);
            System.out.println("Dados escritos com sucesso no arquivo exemplo.txt.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void LeituraDeArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("exemplo.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        EscritaDeArquivo();
        LeituraDeArquivo();
    }
}