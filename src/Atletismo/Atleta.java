package Atletismo;

public class Atleta {
    private String nome;
    private int nivel;
    private int energia;

    public Atleta(String nome, int nivel, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }
}
