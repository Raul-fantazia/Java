import javax.swing.JOptionPane;

public class RecebendoValores {
    public static void main(String[] args) {
        // Inicializando a variável para armazenar o maior valor
        double maiorValor = 0.0;

        while (true) {
            // Recebendo o valor do usuário
            String deposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar (para encerrar o programa, digite 0):");

            // Convertendo a string para double
            double valor = Double.parseDouble(deposito);

            // Verifica se o valor é 0, se for, encerra o loop
            if (valor == 0) {
                break;
            }

            // Verifica se o valor atual é maior que o maior valor registrado
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        // Informando o maior valor para o usuário
        JOptionPane.showMessageDialog(null, "O maior valor informado foi: " + maiorValor);
    }
}
