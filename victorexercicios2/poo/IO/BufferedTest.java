package victorexercicios2.poo.IO;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\victo\\IdeaProjects\\treining\\src\\treiningexercices\\obj\\IO\\pastatreino2.txt");

        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("java é o melhor");
            bw.newLine();
            bw.write("Estudar Java para ser o melhor");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(file);BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
