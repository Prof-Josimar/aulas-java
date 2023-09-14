package br.com.view;

import javax.swing.JOptionPane;

public class Z_Exercicios_02 {

    public static void main(String[] args) {
        String tratamento;
     
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite uma hora inteira"));
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        char sexo = JOptionPane.showInputDialog("Insira seu sexo: ").charAt(0);

        if (sexo == 'F' || sexo == 'f') {
            tratamento = "Senhora";
        } else {
            tratamento = "Senhor";
        }
        if (hora < 12) {
            System.out.println("Bom dia " + tratamento + " " + nome.toUpperCase());
        } else if (hora > 18) {
            System.out.println("Boa noite " + tratamento + " " + nome.toUpperCase());
        } else {
            System.out.println("Boa tarde " + tratamento + " " + nome.toUpperCase());
        }

    }
}


/*

Object[] sex = {"Masculino", "Feminino", "LGBTQIA+"};
        Object res = JOptionPane.showInputDialog(null, "Escolha um item", "Selecao de itens",
                JOptionPane.PLAIN_MESSAGE, null, sex, "");
        System.out.println(res);

 */
