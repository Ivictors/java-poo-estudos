package victorexercicios1.javacore.sobrecarga.teste;

import victorexercicios1.javacore.sobrecarga.dominio.SobrecargaMetodo;

public class SobrecargaAnime {
    public static void main(String[] args) {
        SobrecargaMetodo varReferencia = new SobrecargaMetodo();

        varReferencia.init("Naruto", "Streaming","Acao",500);

        varReferencia.imprime();
    }
}
