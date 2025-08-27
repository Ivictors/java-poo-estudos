package victorexercicios2.poo.enumeradores.test;

import victorexercicios2.poo.enumeradores.domain.Pedido;
import victorexercicios2.poo.enumeradores.domain.StatusPedido;

public class Restaurante {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1010,"Victor");
        Pedido pedido2 = new Pedido(1011,"Diogo");
        Pedido pedido3 = new Pedido(1012,"Diego");

        pedido1.atualizarStatus(StatusPedido.ENVIADO);
        pedido2.atualizarStatus(StatusPedido.PREPARANDO);
        pedido1.atualizarStatus(StatusPedido.ENTREGUE);

        pedido1.exibir();
        pedido2.exibir();
        pedido3.exibir();
    }
}
