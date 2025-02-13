package Ativ_5;

import java.util.Locale;
import java.util.Scanner;

public class Objet {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira um número: ");
            int x = sc.nextInt();

            Result result = new Result(x);
            String mensagem = result.ParImpar();
            System.out.println(mensagem);

            sc.close();
        }
    }