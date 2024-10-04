import javax.swing.JOptionPane;

public class Movimentacoes {
    public static void main(String[] args) {
        // Iniciando a soma
        double soma = 0.0;

        while (true) {
            // Recebendo o valor do usuário
            String valor = JOptionPane.showInputDialog("Digite o valor que deseja depositar (0 para ver seu saldo final):");

            // Convertendo o valor de String para double
            double dinheiro = Double.parseDouble(valor);

            // Verificando se o usuário digitou 0 para encerrar o loop
            if (dinheiro == 0) {
                break;  // Encerra o loop se o usuário digitar 0
            }

            // Somando o valor digitado à variável soma
            soma += dinheiro;
        }

        // Exibindo o saldo final após sair do loop
        JOptionPane.showMessageDialog(null, "Seu saldo final é: " + soma);
    }
}
