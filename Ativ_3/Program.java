package Ativ_3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = sc.nextInt();

        String mensagem = NumberUtils.verificarIntervalo(num);
        System.out.println(mensagem);

        sc.close();
    }
}
