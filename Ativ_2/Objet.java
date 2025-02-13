package Ativ_2;

import java.util.Locale;
import java.util.Scanner;

public class Objet {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira sua idade:");
            int idade = sc.nextInt();

            Product product = new Product(idade);

            String mensagem = product.verificarVoto();
            System.out.printf(mensagem);

            sc.close();
        }
    }