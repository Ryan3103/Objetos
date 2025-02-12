package Ativ_4;

public class Result {

    public static String verificar(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return (media >= 7) ? "O aluno foi aprovado" : "O aluno NÃO foi aprovado";
    }
}
