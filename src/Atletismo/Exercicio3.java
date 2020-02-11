package Atletismo;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Joãozinho", 20, 100);
        Atleta atleta2 = new Atleta("Mariazinha", 15, 120);

        Prova prova1 = new Prova(15, 90, 1);
        Prova prova2 = new Prova(20, 100, 2);
        Prova prova3 = new Prova(15, 120, 3);

        realizarProva(atleta1, prova1);
        realizarProva(atleta1, prova2);
        realizarProva(atleta1, prova3);

        System.out.println("\n\n");
        realizarProva(atleta2, prova1);
        realizarProva(atleta2, prova2);
        realizarProva(atleta2, prova3);
    }

    public static void realizarProva(Atleta atleta, Prova prova) {
        if (prova.podeRealizar(atleta)) {
            System.out.println("O(A) atleta " + atleta.getNome() + " conseguiu realizar a prova " + prova.getNumeroProva());
        }else{
            System.out.println("O(A) atleta "  + atleta.getNome() + " não conseguiu realizar a prova " + prova.getNumeroProva());
        }
    }
}
