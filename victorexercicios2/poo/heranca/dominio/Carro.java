package victorexercicios2.poo.heranca.dominio;

public class Carro extends  Veiculo{
    protected int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: "+ marca+ " modelo: "+modelo+" ano: "+ano+" Quantidade de portas: "+ quantidadePortas);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
