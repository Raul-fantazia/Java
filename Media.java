import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {

        // Inicializando variáveis
        double soma = 0.0;
        double media = 0.0;
        int total = 0; // Contador para os números inseridos

        while (true) {
            // Recebendo os valores e convertendo
            String numero = JOptionPane.showInputDialog("Digite um número; (para encerrar o programa, digite 0)");
            int valor = Integer.parseInt(numero);

            // Encerrando caso seja 0
            if (valor == 0) {
                break;
            }

            // Somando o valor inserido
            soma += valor;

            // Contando quantos números foram inseridos
            total++;
        }

        // Calculando a média (somente se total for maior que 0)
        if (total > 0) {
            media = soma / total;
        }

        // Exibindo a média na tela
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}




         

