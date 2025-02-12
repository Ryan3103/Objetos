package Objetos;

import java.util.Locale;
import java.util.Scanner;
import static Objetos.Triangle.*;

public class Ativ_1 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira dois números: ");
            int x = sc.nextInt();
            int y = sc.nextInt();

            int higher = Triangle.max(x, y);

            showResult(higher);

            sc.close();
        }
        }