package victorexercicios1.javacore.regexI;

import java.util.Scanner;

public class ScannerDelimitadores02 {
    public static void main(String[] args) {
        String texto = "Naruto,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println(i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
            }else System.out.println(scanner.next());
        }
    }

}
