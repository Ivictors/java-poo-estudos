package victorexercicios2.poo.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesBasicosTeste {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\treiningexercices\\obj\\IO\\pastatreino1.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso.");
            } else {
                System.out.println("Arquivo já existe.");
            }

            // Escrevendo no arquivo
            try (FileWriter fw = new FileWriter(file, true)) {
                fw.write("Java é o melhor\n");
            }

            // Lendo o arquivo
            try (FileReader fr = new FileReader(file)) {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
