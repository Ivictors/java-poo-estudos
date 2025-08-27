package victorexercicios2.poo.enumeradores.domain;

public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private StatusPedido statusPedido;

    public Pedido(int numeroPedido, String nomeCliente) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.statusPedido = StatusPedido.PENDENTE;
    }

    public void atualizarStatus(StatusPedido novoStatus){
        this.statusPedido=novoStatus;
        System.out.println("O status do pedido: "+ numeroPedido+" foi atualizado para: "+novoStatus);
    }

    public void exibir (){
        System.out.println("Numero do pedido: "+getNumeroPedido());
        System.out.println("Nome do cliente: "+getNomeCliente());
        System.out.println("Status do ´Pedido: "+ getStatusPedido());
        System.out.println("----------------------------------");
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

}
