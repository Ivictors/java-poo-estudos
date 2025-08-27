package victorexercicios2.poo.interfaces.teste;

import victorexercicios2.poo.interfaces.dominio.UsuarioSistema;

import java.util.Scanner;

public class AutenticarTest {
    public static void main(String[] args) {
        UsuarioSistema usuario = new UsuarioSistema("Vi","123");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha para entrar: ");
        String senha = sc.nextLine();

        usuario.autenticar(senha);

        sc.close();
    }
}
