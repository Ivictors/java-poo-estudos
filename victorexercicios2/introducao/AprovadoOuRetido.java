package victorexercicios2.introducao;

import java.util.Scanner;

public class AprovadoOuRetido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota");
        double nota = sc.nextDouble();

        if (nota >=7 && nota <=10) {
            System.out.println("aprovado");
        } else if (nota >= 5 && nota <=6) {
            System.out.println("Recuperação");
        } else if (nota >=0 && nota < 5) {
            System.out.println("Retido");
        }
        else {
            System.out.println("Opção invalida");
        }

        sc.close();
    }
}
