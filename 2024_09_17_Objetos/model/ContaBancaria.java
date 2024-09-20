package model;

public class ContaBancaria {

    private int id;
    private String nome;
    private double saldo;

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor depositado");
        } else {
            System.out.println("Valor de deposito deve ser positivo");
        }
    }


    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor deve ser positivo");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor >= 0) {
            if (valor <= saldo) {
                contaDestino.depositar(valor);
                saldo -=valor;
                System.out.println("Transferencia realizada");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor deve ser positivo :");
        }
    }

}
