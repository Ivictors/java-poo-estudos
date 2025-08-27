package victorexercicios1.introducao;

import victorexercicios1.introducao.dominio.Registro;

import java.util.Scanner;

public class ArrayBasico9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Registro[] quartos = new Registro[10];

        for (int i = 0; i < n; i++) {
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            String nome = sc.nextLine();
            String email = sc.nextLine();

            quartos[numeroQuarto] = new Registro(nome, email);
        }
        for (int j = 0; j < quartos.length; j++) {
            if (quartos[j] != null) {
                System.out.println("Quarto" + j + ":" + quartos[j]);
            }
        }

        sc.close();
    }
}
