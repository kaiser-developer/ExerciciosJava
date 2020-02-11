package Futebol;

public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol("Dudu", 100, 50, 0, 80);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("Marcos", 120, 70, 0, 100);
        SessaoDeTreinamento treinar = new SessaoDeTreinamento(1);

        treinar.treinarA(jogador1);
        treinar.treinarA(jogador1);
        treinar.treinarA(jogador1);
        treinar.treinarA(jogador1);
        treinar.treinarA(jogador1);
        treinar.treinarA(jogador2);
        treinar.treinarA(jogador2);
        treinar.treinarA(jogador2);
        treinar.treinarA(jogador2);
        treinar.treinarA(jogador2);
    }
}
