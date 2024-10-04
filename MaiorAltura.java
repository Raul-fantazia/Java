import javax.swing.JOptionPane;

public class MaiorAltura {
    public static void main(String[] args) {
        double maiorAlturaMasculina = 0.0;
        double maiorAlturaFeminina = 0.0;

        while (true) {
            String alturaStr = JOptionPane.showInputDialog("Digite a altura (em metros) ou 0 para encerrar:");
            double altura = Double.parseDouble(alturaStr);

            // Verifica se o valor de altura é zero para encerrar a leitura
            if (altura == 0) {
                break;
            }

            String sexo = JOptionPane.showInputDialog("Digite o sexo ('m' para masculino ou 'f' para feminino):");

            // Atualiza as maiores alturas conforme o sexo
            if (sexo.equalsIgnoreCase("m")) {
                if (altura > maiorAlturaMasculina) {
                    maiorAlturaMasculina = altura;
                }
            } else if (sexo.equalsIgnoreCase("f")) {
                if (altura > maiorAlturaFeminina) {
                    maiorAlturaFeminina = altura;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, digite 'm' ou 'f'.");
            }
        }

        // Exibe as maiores alturas lidas
        String resultado = "";
        if (maiorAlturaMasculina > 0) {
            resultado += "A maior altura masculina é: " + maiorAlturaMasculina + " metros.\n";
        } else {
            resultado += "Nenhuma altura masculina foi lida.\n";
        }

        if (maiorAlturaFeminina > 0) {
            resultado += "A maior altura feminina é: " + maiorAlturaFeminina + " metros.";
        } else {
            resultado += "Nenhuma altura feminina foi lida.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
