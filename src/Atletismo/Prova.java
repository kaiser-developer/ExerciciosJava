package Atletismo;

public class Prova {
    private int energiaNecessaria;
    private int dificuldade;
    private int numeroProva;

    public Prova(int dificuldade, int energiaNecessaria, int numeroProva) {
        this.energiaNecessaria = energiaNecessaria;
        this.dificuldade = dificuldade;
        this.numeroProva = numeroProva;
    }

    public boolean podeRealizar(Atleta atleta){
        if(atleta.getEnergia() >= this.energiaNecessaria && atleta.getNivel() >= this.dificuldade){
            return true;
        }else{
            return false;
        }
    }

    public int getNumeroProva() {
        return numeroProva;
    }
}
