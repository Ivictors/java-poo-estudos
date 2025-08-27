package victorexercicios2.poo.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulacao {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo");
        String nomeAquivo = sc.nextLine();

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        String caminhoBase = "C:\\Users\\victo\\IdeaProjects\\treining\\src\\treiningexercices\\obj\\IO\\" + nomeAquivo + ".txt";

        File file = new File(caminhoBase);
        FileWriter fw = new FileWriter(file,true);
        fw.write("Nome: " + nome + "\nIdade: " + idade + "\n");
        fw.close();

        try (FileReader fr = new FileReader(file)){
            int i;
            while ((i = fr.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.exists()){
            System.out.println("Arquivo criado com sucesso.");
        } else System.out.println("Arquivo não existe");
        sc.close();
    }
}
