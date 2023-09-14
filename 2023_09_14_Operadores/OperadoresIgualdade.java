package br.com.view;

public class OperadoresIgualdade {

    public static void main(String[] args) {
        System.out.println(5 == 5);
        System.out.println(5 != 5);
        System.out.println(5 > 5);
        System.out.println('\u0065');
        
        System.out.println("a = a " + ('a' == '\u0097'));
        
        String nome = "Jose";
        System.out.println(nome.equals("José"));

        int valorA = 1;
        int valorB = 2;

        if (valorA == valorB) {
            System.out.println("Valores iguais");
        } else {
            System.out.println("Valores diferentes");
        }
    }

}
