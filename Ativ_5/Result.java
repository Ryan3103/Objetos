package Ativ_5;

public class Result {

        public int numero;

        public Result(int numero) {
            this.numero = numero;
        }

        public String ParImpar() {
            if (this.numero % 2 == 0) {
                return this.numero + " é par";
            } else {
                return this.numero + " é ímpar";
            }
        }
    }