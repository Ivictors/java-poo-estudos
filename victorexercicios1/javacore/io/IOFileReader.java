package victorexercicios1.javacore.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class IOFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\maratonajava\\pasta1.txt");

        try (FileReader fr = new FileReader(file)) {
            char[] in = new char[' '];
            fr.read(in);
            for (char c : in) {
                System.out.println(c);
            }
            //Lembre-se: Outra forma de exibir
            int i;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
