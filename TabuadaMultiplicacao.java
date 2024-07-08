import java.security.SecureRandom;
import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Solicitar ao usuário que digite um número
        System.out.print("Digite um número para ver sua tabuada de multiplicação até o 10: ");
        int numero = scanner.nextInt();

        // Passo 2 e 3: Declarar e preencher a matriz com os resultados da tabuada
        int[][] tabuada = new int[10][2]; // 10 linhas (de 0 a 9) e 2 colunas (número * i e resultado)

        for (int i = 0; i < 10; i++) {
            tabuada[i][0] = i + 1; // Número i da tabuada
            tabuada[i][1] = numero * (i + 1); // Resultado da multiplicação
        }

        // Passo 4: Imprimir os resultados da tabuada
        System.out.println("\nTabuada de multiplicação do número " + numero + " até o 10:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " * " + tabuada[i][0] + " = " + tabuada[i][1]);
        }

        
        String[][] alunos = new String[2][5];



        String[][] professores = new String [5][2];


        int[][] numeros = new int[3][3];
        SecureRandom rd = new SecureRandom();
        numeros[0][0] = rd.nextInt(100);


        // imprimindo o número que está na linha 1 e coluna 2
        System.out.println(numeros[1][2]);

        // imprimindo o número que está na linha 0 e coluna 0
        System.out.println(numeros[0][0]);

        scanner.close();
    }
} 
