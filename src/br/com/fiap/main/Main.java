package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo1 = new Geometria();
        String aux, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                aux = JOptionPane.showInputDialog("Qual área deseja calcular?\n1.Quadrado\n2.Retângulo\n3.Círculo");
                opcao = Integer.parseInt(aux);
                switch (opcao){
                    case 1:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(aux);
                        geo1.calcularArea(lado);
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        altura = Float.parseFloat(aux);
                        geo1.calcularArea(lado, altura);
                        break;
                    case 3:
                        aux = JOptionPane.showInputDialog("Digite o valor do raio:");
                        raio = Double.parseDouble(aux);
                        geo1.calcularArea(raio);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO: Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("deseja continuar(sim ou não)?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
