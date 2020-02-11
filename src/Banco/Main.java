package Banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("César Silva", "37647904825");
        Conta conta1 = new Conta(200, "400", "200");

        cliente1.setConta(conta1);

        cliente1.getConta().saque(100);
        cliente1.getConta().saque(2000);
        cliente1.getConta().deposito(3000);
    }
}