package view;
import model.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setId(1201);
        conta1.setNome("José da Silva");
        conta1.setSaldo(0.0);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setId(1202);
        conta2.setNome("Maria da Silva");
        conta2.setSaldo(500);


        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Transferência");
            System.out.println("4. Saldo");
            System.out.println("6. Informações da Conta");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);

                    break;
                case 3:
                    System.out.print("Digite o valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    conta1.transferir(conta2,valorTransferencia);
                    break;
                case 4:
                    System.out.println("Saldo da conta 1: "+ conta1.getSaldo());
                    System.out.println("Saldo da conta 2: "+ conta2.getSaldo());


                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                case 6:
                    System.out.println(conta1.toString());
                    System.out.println(conta2.toString());

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
