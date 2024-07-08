// import java.util.Scanner;

// public class Avaliacao {

//     public static void main (String[] args) {
//         int numero;
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Digite um número: ");

//         numero = scan.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(numero + " x " + i + " = " + (numero * i));
//         }
//  }    
// }

// import java.util.Scanner;

// public class Fatorial02 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in     );
        
//         System.out.print("Digite um número inteiro: ");
//         int num;
//         num = scanner.nextInt()   ;
        
//         // Complete o código abaixo para calcular o fatorial
//         int fatorial = 1;
//         for (int i = 1; i <= num     ; i++) {
//             fatorial = fatorial * i        ;
//         }
        
//         System.out.println("O fatorial de " + num + " é: " + fatorial);
        
//         scanner.close();
//     }
// }

public class OlaMundo {
    public static void main (String[] args    ) {
        
        int[] numeros = {10,10,10,20,30};
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}


