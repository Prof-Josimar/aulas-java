package br.com.view;

import javax.swing.JOptionPane;

public class OperadoresAritimeticos {

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        int inputValue1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor insira um valor 1"));
        int inputValue2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor insira um valor 2"));
        JOptionPane.showMessageDialog(null, inputValue1 + " " + inputValue2);
        JOptionPane.showMessageDialog(null, soma(inputValue1, inputValue2));

    }
}

