package Ativ_3;

import java.util.Locale;
import java.util.Scanner;

public class Product {

    public int num;

    public Product(int num) {
        this.num = num;
    }

        public static String verificarIntervalo(int numero) {
            if (numero >= 10 && numero <= 50) {
                return numero + " está dentro do intervalo de 10 a 50";
            } else {
                return numero + " Nao está dentro do intervalo de 10 a 50";
            }
        }
    }