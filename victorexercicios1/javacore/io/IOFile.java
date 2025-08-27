package victorexercicios1.javacore.io;

import java.io.File;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
        File file1 = new File ("C:\\Users\\victo\\IdeaProjects\\treining\\src\\maratonajava\\pasta1.txt");

        try {
            boolean isCreated = file1.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        boolean isExists = file1.exists();
//        if (isExists){
//            file1.delete();
//        }

        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isHidden());
        System.out.println(file1.lastModified());

    }
}
