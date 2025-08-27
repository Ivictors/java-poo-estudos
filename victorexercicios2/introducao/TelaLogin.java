package victorexercicios2.introducao;

import java.util.Scanner;

public class TelaLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre seu login:");
        final String LOGINCADASTRADO = sc.nextLine();

        System.out.println("Cadastre sua senha:");
        final String SENHACADASTRADA = sc.nextLine();

        boolean acesso = true;
        int tentativas = 0;
        final int LIMITETENTATIVAS = 3;

        while (acesso && tentativas < LIMITETENTATIVAS) {
            System.out.println("Digite seu login cadastrado:");
            String tentativaLogin = sc.nextLine();

            System.out.println("Digite sua senha cadastrada:");
            String tentativaSenha = sc.nextLine();

            if (tentativaLogin.equals(LOGINCADASTRADO) && tentativaSenha.equals(SENHACADASTRADA)) {
                System.out.println("Autenticação feita com sucesso!");
                acesso = false;
            } else {
                System.out.println("Falha na autenticação, login ou senha invalidos!");
                tentativas++;
            }
        }
        if (tentativas == LIMITETENTATIVAS){
            System.out.println("Acesso bloqueado. você atingiu o numero maximo de tentativas.");
        }
        sc.close();
    }
}
