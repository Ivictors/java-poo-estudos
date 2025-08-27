package victorexercicios1.javacore.construtor.teste;

import victorexercicios1.javacore.construtor.dominio.Store1;

public class StoreTest {
    public static void main(String[] args) {
        Store1 vr1 = new Store1("Shoes", "Black",120);
        Store1 vr2 = new Store1("T-shirt", "White",100,'7');
        Store1 vr3 = new Store1("Bag", "Pink",30,'3',"Nike");

        System.out.println("1: object");
        vr1.imprime();
        vr1.setProduct("Shoes X");
        System.out.println(vr1.getProduct());

        System.out.println("2: object");
        vr2.imprime();

        System.out.println("3: object");
        vr3.imprime();

    }
}
