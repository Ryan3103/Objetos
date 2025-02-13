package Ativ_5;

import java.util.Locale;
import java.util.Scanner;

public class Objet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int x = sc.nextInt();

        String mensagem = Result.ParImpar(x);
        System.out.println(mensagem);

        sc.close();
    }
}