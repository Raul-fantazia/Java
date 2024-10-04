import javax.swing.JOptionPane;

public class Saldo {
    public static void main(String[] args) {
        // Inicializando as variáveis para maior e menor saldo
        double menorSaldo = Double.MAX_VALUE; // Inicializa com o maior valor possível
        double maiorSaldo = Double.MIN_VALUE; // Inicializa com o menor valor possível
        int totalDias = 30; // Número de dias

        // Loop para ler os saldos diários
        for (int i = 1; i <= totalDias; i++) {
            // Solicitando o saldo diário ao usuário
            String saldoInput = JOptionPane.showInputDialog("Digite o saldo do dia " + i);

            // Convertendo a string para double
            double saldo = Double.parseDouble(saldoInput);

            // Verificando o menor saldo
            if (saldo < menorSaldo) {
                menorSaldo = saldo;
            }

            // Verificando o maior saldo
            if (saldo > maiorSaldo) {
                maiorSaldo = saldo;
            }
        }

        // Exibindo o menor e o maior saldo
        String resultado = "O menor saldo foi: R$ " + menorSaldo + "\n";
        resultado += "O maior saldo foi: R$ " + maiorSaldo;

        // Mostrando o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}
