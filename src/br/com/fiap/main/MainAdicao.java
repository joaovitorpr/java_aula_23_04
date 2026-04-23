package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao adicao1 = new Adicao();
        int num1, num2, opcao;
        double real1, real2;
        String aux, escolha = "sim";
        while (escolha.equalsIgnoreCase("sim")){ // Enquanto a escolha for igual a "sim" (idenpendente da forma o ciclo/loop se repete.
            try {
                aux = JOptionPane.showInputDialog("Deseja realizar a soma com números?\n1.Inteiros\n2.Reais");
                opcao = Integer.parseInt(aux);
                switch (opcao) {
                    case 1:
                        aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
                        num1 = Integer.parseInt(aux);
                        aux = JOptionPane.showInputDialog("Digite o segundo número: ");
                        num2 = Integer.parseInt(aux);
                        adicao1.setNumInteiro1(num1);
                        adicao1.setNumInteiro2(num2);
                        JOptionPane.showMessageDialog(null, String.format("1°Valor: %d\n2°Valor: %d\nResultado da soma: %d", adicao1.getNumInteiro1(),adicao1.getNumInteiro2(), adicao1.somar(num1, num2)));
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("Digite o primeiro número: ");
                        real1 = Double.parseDouble(aux);
                        aux = JOptionPane.showInputDialog("Digite o segundo número: ");
                        real2 = Double.parseDouble(aux);
                        adicao1.setNumReal1(real1);
                        adicao1.setNumReal2(real2);
                        JOptionPane.showMessageDialog(null, String.format("1°Valor: %f\n2°Valor: %f\nResultado da soma: %f", adicao1.getNumReal1(), adicao1.getNumReal2(),adicao1.somar(real1, real2)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO: Opção inválida!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar o programa(sim ou não)?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
