package victorexercicios2.poo.heranca.dominio;

public class Moto extends Veiculo{
    protected int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: "+ marca+ " modelo: "+modelo+" ano: "+ano+" Cilindradas: "+cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}

