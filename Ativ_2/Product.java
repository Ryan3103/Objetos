package Ativ_2;

public class Product {

        public int idade;
        
        public Product(int idade) {
            this.idade = idade;
        }

        public String verificarVoto() {
            if (this.idade >= 16) {
                return "Você pode votar!";
            } else {
                return "Você não pode votar!";
            }
        }
    }