package Ativ_1;

public class Product {

    private int x;
    private int y;

    public Product(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static int max(int x, int y) {

        int aux;
        if (x > y) {
            aux = x;
        } else {
            aux = y;
        }
        return aux;

    }
    public static void showResult(int valor) {
        System.out.println("O maior número é: " + valor);
    }
}