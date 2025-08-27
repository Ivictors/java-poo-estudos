package victorexercicios1.javacore.regexI;

public class ScannerDelimitadores {
    public static void main(String[] args) {
        String texto = "Naruto, Sasuke, Sakura";
        String[] nomes = texto.split(",");
        for (String nome : nomes){
            System.out.println(nome.trim());
        }
    }

}
