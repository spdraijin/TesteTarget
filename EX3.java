/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, 
que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
*/

import java.util.ArrayList;

public class EX3 {
    public static void main(String[] args) {
        double faturamento[] = new double[30];
        faturamento[0] = 22174.1664;
        faturamento[1] = 24537.6698;
        faturamento[2] = 26139.6134;
        faturamento[3] = 0.0;
        faturamento[4] = 0.0;
        faturamento[5] = 26742.6612;
        faturamento[6] = 0.0;
        faturamento[7] = 42889.2258;
        faturamento[8] = 46251.174;
        faturamento[9] = 11191.4722;
        faturamento[10] = 0.0;
        faturamento[11] = 0.0;
        faturamento[12] = 3847.4823;
        faturamento[13] = 373.7838;
        faturamento[14] = 2659.7563;
        faturamento[15] = 48924.2448;
        faturamento[16] = 18419.2614;
        faturamento[17] = 0.0;
        faturamento[18] = 0.0;
        faturamento[19] = 35240.1826;
        faturamento[20] = 43829.1667;
        faturamento[21] = 18235.6852;
        faturamento[22] = 4355.0662;
        faturamento[23] = 13327.1025;
        faturamento[24] = 0.0;
        faturamento[25] = 0.0;
        faturamento[26] = 25681.8318;
        faturamento[27] = 1718.1221;
        faturamento[28] = 13220.495;
        faturamento[29] = 8414.61;
        ArrayList<Double> semZero = new ArrayList<>();
        double media = 0.0;
        double soma = 0.0;
        double maior = 0.0;
        int qttValorSuperior = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] != 0.0) {
                semZero.add(faturamento[i]);
            }
        }
        double faturamentoSemZero[] = new double[semZero.size()];
        for (int i = 0; i < semZero.size(); i++) {
            faturamentoSemZero[i] = semZero.get(i);
        }
        double menor = faturamentoSemZero[0];
        for (int i = 0; i < faturamentoSemZero.length; i++) {
            if (faturamentoSemZero[i] < menor) {
                menor = faturamentoSemZero[i];
            }
            if (faturamentoSemZero[i] > maior) {
                maior = faturamentoSemZero[i];
            }
            soma = soma + faturamentoSemZero[i];
            media = soma / faturamentoSemZero.length;
            if (faturamentoSemZero[i] > media) {
                qttValorSuperior++;
            }
            System.out.println("[" + faturamentoSemZero[i] + "]");
        }
        System.out.println("\n[" + menor + "]" + " foi o menor valor de faturamento do mês\n");
        System.out.println("[" + maior + "]" + " foi o maior valor de faturamento do mês\n");
        System.out.println("A média de faturamento foi de: " + "[" + media + "]\n");
        System.out.println("A quantidade de vezes no mês que o valor de faturamento diário foi maior que a média\n"
                + " mensal foram " + qttValorSuperior + " vezes");
    }
}
