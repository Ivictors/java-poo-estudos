package victorexercicios1.javacore.construtor.dominio;

public class Store1 {
    private String product;
    private String color;
    private int value;
    private char size;
    private String brand;

    static {
        System.out.println("Loja Vm");
    }

    public Store1(String product, String color, int value) {
        this.product = product;
        this.color = color;
        this.value = value;
    }

    public Store1(String product, String color, int value, char size) {
        this(product, color, value);
        this.size = size;
    }

    public void imprime() {
        System.out.println(this.product);
        System.out.println(this.color);
        System.out.println(this.value);
        System.out.println(this.size);
    }

    public Store1(String product, String color, int value, char size, String brand) {
        this(product, color, value, size);
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
