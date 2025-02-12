package Ativ_4;

import java.sql.Struct;
import java.util.Locale;
import java.util.Scanner;

public class Objet {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota:");
        double nota2 = sc.nextDouble();

        String mensagem = Result.verificar(nota1, nota2);
        System.out.println(mensagem);
        sc.close();
    }
}