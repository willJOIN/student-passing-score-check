import java.util.Scanner;

public class ExercicioMediaAluno {
    public static void main(String[] args) {
        /*
            Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média.
            A atribuição de conceitos obedece à tabela abaixo:

            Média de Aproveitamento  Conceito
            Entre 9.0 e 10.0        A
            Entre 7.5 e 9.0         B
            Entre 6.0 e 7.5         C
            Entre 4.0 e 6.0         D
            Entre 4.0 e zero        E

            O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente
            e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
         */


        float nota1 = 0, nota2 = 0, media = 0;

        // Enquanto notas forem maiores que dez, pedir novamente
        do {
            try {
                Scanner leitor = new Scanner(System.in);
                System.out.println("Digite a primeira nota:\n");
                nota1 = leitor.nextFloat();

                System.out.println("Digite a segunda nota:\n");
                nota2 = leitor.nextFloat();
            } catch (Exception ex) {
                System.out.println("Erro ao pegar nota1 ou nota2:\n" + ex);
            }

            if (nota1 > 10.0f || nota2 > 10.0f) {
                System.out.println("Notas nao podem ser maior que 10!");
            }
        } while (nota1 > 10.0f || nota2 > 10.0f);

        // Calcular media
        try {
            media = calculaMedia(nota1, nota2);
        } catch (Exception ex) {
            System.out.println("Erro ao calcular media no calculaMedia():\n" + ex);
        }

        // Printar notas e media
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Media de notas: " + media);

        // Printar em qual conceito se encaixa
        if (media > 9.0f && media < 10.0f) {
            System.out.println("Conceito: A");
        }
        else if (media > 7.5f && media < 9.0f) {
            System.out.println("Conceito: B");
        }
        else if (media > 6.0f && media < 7.5f) {
            System.out.println("Conceito: C");
        }
        else if (media > 4.0f && media < 6.0f) {
            System.out.println("Conceito: D");
        }
        else if (media > 0.0f && media < 4.0f) {
            System.out.println("Conceito: E");
        }

        // Printar se foi aprovado ou nao
        if (media > 6.0f) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
        }
    }

    private static float calculaMedia(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }
}
