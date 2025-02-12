package Ativ_2;

public class Result {

        public static String verificarVoto(int idade) {
            if (idade >= 16) {
                return "Você pode votar!";
            } else {
                return "Você nao pode votar!";
            }
        }
}