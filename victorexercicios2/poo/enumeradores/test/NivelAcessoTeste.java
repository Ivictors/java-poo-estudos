package victorexercicios2.poo.enumeradores.test;

import victorexercicios2.poo.enumeradores.domain.NivelAcesso;
import victorexercicios2.poo.enumeradores.domain.Usuario;

public class NivelAcessoTeste {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Victor", NivelAcesso.ADM);
        Usuario usuario2 = new Usuario("Diogo", NivelAcesso.GUEST);
        Usuario usuario3 = new Usuario("Diego", NivelAcesso.USER);

        usuario1.imprimi();
        usuario2.imprimi();
        usuario3.imprimi();
    }
}
