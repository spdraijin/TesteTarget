/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
informado um número, ele calcule a sequência de Fibonacci e 
retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ultimo = 0, penultimo = 1;
        int numero;
        System.out.print("Informe o número: ");
        numero = input.nextInt();
        while (penultimo < numero) {
            int x = penultimo;
            penultimo = ultimo + penultimo;
            ultimo = x;
        }
        if (numero == penultimo) {
            System.out.print(numero + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println(numero + " não pertence a sequencia de Fibonacci");
        }
    }
}
