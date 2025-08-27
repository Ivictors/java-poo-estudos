package victorexercicios1.introducao;

import java.util.Scanner;

public class StringMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra abaixo para manipularmos:");
        String palavra = sc.nextLine();
        String invertida ="";

        for (int i = palavra.length() - 1  ; i >= 0 ; i--){
            invertida += palavra.charAt(i);
        }
        System.out.println(invertida);

        System.out.println(palavra.trim());
        System.out.println(palavra.charAt(0) + " " + palavra.charAt(palavra.length() - 1));
        System.out.println(palavra.trim().length());
        System.out.println(palavra.indexOf("java"));
        System.out.println(palavra.replace("hoje", "amanha"));

        sc.close();
    }
}
