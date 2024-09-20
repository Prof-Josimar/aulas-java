package model;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;
    private double limite;
    private String cpf  = "000000000";

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + ", limite=" + limite + ", cpf=" + cpf + '}';
    }

    public boolean saca(double valor) {
        if (saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean transfere(Conta destino, double valor) {
        if (!this.saca(valor)) {
            return false;
        }
        destino.deposita(valor);
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
