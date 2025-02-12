package Objetos;

public class Triangle {

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