package victorexercicios1.javacore.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class IOBufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\maratonajava\\pasta2.txt");
        try(FileWriter fw = new FileWriter(file,true); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(", é incrivel");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
