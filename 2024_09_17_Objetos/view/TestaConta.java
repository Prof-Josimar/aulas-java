package view;

// https://pt.slideshare.net/regispires/java-05-oo-basica-presentation
import static uteis.Uteis.gerarRandom;

import model.Conta;

import java.util.Scanner;
import java.util.Locale;

public class TestaConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta contaProf;
        contaProf = new Conta();
        contaProf.setNumero(gerarRandom());
        contaProf.setNome("Professor");
        System.out.println("Digite o valor de abertura : " + contaProf.getNome());
        double valorAbertura = sc.nextDouble();

        contaProf.setSaldo(valorAbertura);

        Conta contaAluno;
        contaAluno = new Conta();
        contaAluno.setNumero(gerarRandom());
        contaAluno.setNome("Aluno");
        System.out.println("Digite o valor de abertura : " + contaAluno.getNome());
        valorAbertura = sc.nextDouble();

        contaAluno.setSaldo(valorAbertura);
        System.out.println("Codigo da Conta..........: " + contaProf.getNumero());
        System.out.println("Meu Saldo atual..........: " + contaProf.getSaldo());
        System.out.println("Saca 200 reais ");

        if (contaProf.saca(200)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Não foi possível relizar saque");
        }

        System.out.println("Novo  Saldo..............: " + contaProf.getSaldo());

        System.out.println("----------------------------------------------------------");

        System.out.println("Codigo da Conta..........: " + contaAluno.getNumero());
        System.out.println("Conta aluno saldo atual..: " + contaAluno.getSaldo());
        System.out.println("Tranferir para professor ");
        System.out.println("Digite o valor de transferencia : " + contaProf.getNome());
        double valorTransfere = sc.nextDouble();

        if (contaAluno.transfere(contaProf, valorTransfere)) {
            System.out.println("Transferecia realizada");
        } else {
            System.out.println("Impossivel realizar transferencia");
        }

        System.out.println("Saldo do aluno agora.....: " + contaAluno.getSaldo());
        System.out.println("Meu saldo agora......... : " + contaProf.getSaldo());
        sc.close();
    }

}
