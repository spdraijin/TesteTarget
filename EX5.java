/*5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        String inversa = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a palavra ou frase a ser invertida: ");
        String palavra = input.nextLine();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa = inversa + palavra.charAt(i);
        }
        System.out.println("String inserida: " + palavra);
        System.out.println("String invertida: " + inversa);
    }
}
