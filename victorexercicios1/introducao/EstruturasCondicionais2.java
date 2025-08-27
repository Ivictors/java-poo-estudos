package victorexercicios1.introducao;

import java.util.Scanner;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade <= 15) {
            System.out.println("Criança");
        } else if (idade > 15 && idade < 18) {
            System.out.println("Adolecente");
        } else System.out.println("Adulto");

        sc.close();
    }
}
