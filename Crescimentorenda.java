import javax.swing.JOptionPane;

public class Crescimentorenda {
    public static void main(String[] args) {
        double patrimonio1 = 10000; // Fortuna da pessoa A
        double patrimonio2 = 5000;   // Fortuna da pessoa B

        // Crescimento mensal
        double crescimentoA = 100.0; // Crescimento mensal da pessoa A
        double crescimentoB = 300.0;  // Crescimento mensal da pessoa B

        // Mês inicial
        int mes = 0;

        // StringBuilder para armazenar resultados
        StringBuilder resultado = new StringBuilder();
        resultado.append("Mês\tFortuna A\tFortuna B\tDiferença\n");

        // Laço para calcular a diferença mês a mês
        while (patrimonio2 <= patrimonio1) {
            // Incrementa o mês
            mes++;

            // Adiciona os valores atuais ao resultado
            resultado.append(mes)
                     .append("\t")
                     .append(String.format("%.2f", patrimonio1))
                     .append("\t")
                     .append(String.format("%.2f", patrimonio2))
                     .append("\t")
                     .append(String.format("%.2f", patrimonio1 - patrimonio2))
                     .append("\n");

            // Atualiza as fortunas para o próximo mês
            patrimonio1 += crescimentoA;
            patrimonio2 += crescimentoB;
        }

        // Adiciona o resultado final quando B ultrapassa A
        resultado.append(mes)
                 .append("\t")
                 .append(String.format("%.2f", patrimonio1))
                 .append("\t")
                 .append(String.format("%.2f", patrimonio2))
                 .append("\t")
                 .append(String.format("%.2f", patrimonio1 - patrimonio2))
                 .append("\n");

        resultado.append("A pessoa B ultrapassou a fortuna da pessoa A após " + mes + " meses.");

        // Exibe os resultados na caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString(), "Diferença de Fortunas", JOptionPane.INFORMATION_MESSAGE);
    }
}
