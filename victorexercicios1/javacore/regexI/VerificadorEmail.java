package victorexercicios1.javacore.regexI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadorEmail {
    public static void main(String[] args) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
        String email = "Dev2024@outlook.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()){
            System.out.println("Email válido!");
        } else {
            System.out.println("Email inválido.");
        }
    }
}
