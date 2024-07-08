import java.util.Scanner;

public class CalcularMediaNotas {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int somatorioNotas = 0, notaDigitada, mediaNotas;

        for (int contador=1; contador<=4; contador++){
            System.out.print("Digite a nota da avaliação " + contador + ": ");
            
            notaDigitada = scan.nextInt();

            somatorioNotas = somatorioNotas + notaDigitada; 
        }

        mediaNotas = somatorioNotas / 4;

        if (mediaNotas <5 ){
            System.out.println("ALUNO: Reprovado");
        } else if (mediaNotas < 7) {
            System.out.println("ALUNO: Exame de Recuperação");
        } else {
            System.out.println("ALUNO: Aprovado");
        }

        scan.close();

    }
    
}
