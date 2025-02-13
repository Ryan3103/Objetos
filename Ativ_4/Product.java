package Ativ_4;

import java.sql.Struct;
import java.util.Locale;
import java.util.Scanner;

public class Product {

        private double nota1;
        private double nota2;
        private double media;

        public Product(double nota1, double nota2) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.calcularMedia();
        }

        public void calcularMedia() {
            this.media = (this.nota1 + this.nota2) / 2;
        }

        public String verificar() {
            return (this.media >= 7) ? "O aluno foi aprovado" : "O aluno NÃO foi aprovado";
        }
    }