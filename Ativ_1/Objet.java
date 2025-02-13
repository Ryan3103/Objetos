package Ativ_1;

import java.util.Locale;
import java.util.Scanner;


public class Objet {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira dois números: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int higher = Product.max(x, y);

            Product.showResult(higher);

            sc.close();  // Fechando o scanner
        }
    }