package Ativ_2;

import java.util.Locale;
import java.util.Scanner;
import static Ativ_2.Objt.*;

public class Objt {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira sua idade:");
            int idade = sc.nextInt();

            String mensagem = Result.verificarVoto(idade);
            System.out.printf(mensagem);

            sc.close();
        }
    }