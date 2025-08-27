package victorexercicios1.javacore.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class IOBufferedRead {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\maratonajava\\pasta2.txt");

        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
