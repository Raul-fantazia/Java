import javax.swing.JOptionPane;

public class Exibindo {
    public static void main(String[] args) {
        // Inicializando a soma
        int soma = 0;

        // Recebendo o número do usuário
        String valor = JOptionPane.showInputDialog("Digite um número natural:");
        int numero = Integer.parseInt(valor);

        // Verificando se o número é menor que 0
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número natural (0 ou maior).");
        } else {
            // Somando todos os números de 0 até o número digitado
            for (int i = 0; i <= numero; i++) {
                soma += i; // Adiciona i à soma
            }
            // Exibindo o resultado na tela 
            JOptionPane.showMessageDialog(null, "A soma de todos os números de 0 até " + numero + " é " + soma);
        }
    }
}
