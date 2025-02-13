package Ativ_3;

public class NumberUtils {

        public int num;

        public NumberUtils(int num) {
            this.num = num;
        }

        public static String verificarIntervalo(int numero) {
            if (numero >= 10 && numero <= 50) {
                return numero + " está dentro do intervalo de 10 a 50";
            } else {
                return numero + " Nao está dentro do intervalo de 10 a 50";
            }
        }
    }