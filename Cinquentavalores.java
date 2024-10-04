import javax.swing.JOptionPane;

public class CinquentaValores {
    public static void main(String[] args) {

        // Inicializando variáveis
        double media = 0.0;
        double maiorvalor = Double.MIN_VALUE; // Menor valor possível inicialmente
        double menorvalor = Double.MAX_VALUE; // Maior valor possível inicialmente
        int total = 50; // Total de valores que o usuário deve informar
        double soma = 0.0; // Para calcular a média

        // Loop para coletar 50 valores
        for (int i = 0; i < total; i++) {
            // Solicitando os valores ao usuário
            String valores = JOptionPane.showInputDialog("Digite um valor");

            // Convertendo o valor digitado para double
            double valor = Double.parseDouble(valores);

            // Verificando o maior valor
            if (valor > maiorvalor) {
                maiorvalor = valor;
            }

            // Verificando o menor valor
            if (valor < menorvalor) {
                menorvalor = valor;
            }

            // Acumulando os valores para calcular a média
            soma += valor;
        }

        // Calculando a média
        media = soma / total;

        // Exibindo os resultados
        String resultado = "O maior valor é: " + maiorvalor + "\n";
        resultado += "O menor valor é: " + menorvalor + "\n";
        resultado += "A média dos valores é: " + media;

        // Mostrando os resultados em um diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}

