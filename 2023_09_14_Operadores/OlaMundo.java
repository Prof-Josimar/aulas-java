package br.com.view;

import javax.swing.JOptionPane;

public class OlaMundo {

    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("Por favor digiter seu nome ");
        JOptionPane.showMessageDialog(null, "Bom dia " + msg);
        System.out.println("Bom dia " + msg);
    }

}
