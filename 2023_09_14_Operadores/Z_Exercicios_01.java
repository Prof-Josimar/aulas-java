package br.com.view;

import javax.swing.JOptionPane;
/*
   Solicitar 2 numero e exibir se um é multiplo do outro?
 */
public class Z_Exercicios_01 {

    public static void main(String[] args) {
        int inputValue1 = Integer.parseInt(JOptionPane.showInputDialog("Please input a value 1"));
        int inputValue2 = Integer.parseInt(JOptionPane.showInputDialog("Please input a value 2"));
        
        if (inputValue1 % inputValue2 == 0) {
            JOptionPane.showMessageDialog(null, "São divisores");
        } else {
            JOptionPane.showMessageDialog(null, "São Não divisores");
        }
    }
}
