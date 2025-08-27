package victorexercicios1.javacore.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOFileWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\maratonajava\\pasta1.txt");

        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("treinando Java");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
