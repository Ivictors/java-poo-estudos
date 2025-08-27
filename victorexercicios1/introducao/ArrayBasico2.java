package victorexercicios1.introducao;

public class ArrayBasico2 {
    public static void main(String[] args) {

        int [][] numeros= new int[3][3];
        numeros [0][0]=10;
        numeros [0][1]=2;
        numeros [0][2]=4;
        numeros [1][0]=5;
        numeros [1][1]=8;
        numeros [1][2]=1;
        numeros [2][0]=7;
        numeros [2][1]=3;
        numeros [2][2]=3;

//      System.out.println(numeros[0][0]*numeros[1][1]*numeros[2][2]);

        int resultado=1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i==j){
                    resultado= resultado*numeros[i][j];
                }
            }
        }
        System.out.println(resultado);
    }
}
