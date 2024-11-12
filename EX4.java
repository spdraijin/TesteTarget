/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
*/

public class EX4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double totalMensal = sp + rj + mg + es + outros;
        double perSp, perRj, perMg, perEs, perOutros;
        perSp = (sp / totalMensal) * 100;
        perRj = (rj / totalMensal) * 100;
        perMg = (mg / totalMensal) * 100;
        perEs = (es / totalMensal) * 100;
        perOutros = (outros / totalMensal) * 100;
        double perTotal = perSp + perRj + perMg + perEs + perOutros;
        System.out.println("O percentual de SP foi de: " + perSp + "\n");
        System.out.println("O percentual de RJ foi de: " + perRj + "\n");
        System.out.println("O percentual de MG foi de: " + perMg + "\n");
        System.out.println("O percentual de ES foi de: " + perEs + "\n");
        System.out.println("O percentual de outros estados foi de: " + perOutros + "\n");
    }
}
