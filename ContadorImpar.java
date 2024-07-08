public class ContadorImpar {

    public static void main (String[] args) {
        int qtdeImpar=0; // esta variável será responsável por contar qtos números ímpares existem

        for (int contador = 1; contador <=100; contador++){ // fazendo o loop de 1 a 100 
            if (contador % 2 != 0) { // verificando se o número é ímpar com o uso do % - só entra aqui se o número for ímpar
                System.out.print(contador + " - "); 
                qtdeImpar++; // somando a qtde de ímpar encontrada 
            }
        }
        System.out.print("Existem " + qtdeImpar + " números pares entre 1 e 100"); // após terminar o loop, mostra para o usuário qtos ímpares encontrou
    }
}
