package Banco;

public class Conta {
    private float saldo;
    private String numeroConta;
    private String agencia;

    public Conta(float saldo, String numeroConta, String agencia) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void saque(float valor){
        if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            System.out.println("Seu novo saldo é: R$ " + this.saldo);
        }else{
            System.out.println("Seu saldo não é suficiente para efetuar o saque");
        }
    }

    public void deposito(float valor){
        this.saldo = this.saldo + valor;

        System.out.println("Seu novo saldo é: R$ " + this.saldo);
    }
}
