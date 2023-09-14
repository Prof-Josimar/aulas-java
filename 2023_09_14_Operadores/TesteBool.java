package br.com.view;

import java.util.Scanner;

public class TesteBool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está de folga?");
        boolean folga = scanner.nextBoolean();

        System.out.println("Tem sol?");
        boolean temSol = scanner.nextBoolean();

        if (temSol && folga) {
            System.out.println("irei ir passear hoje!!! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }

//O Retorno só será "irei ir passear hoje!!! =D" se TODAS as condições forem true.
    }

}
