package Futebol;

public class SessaoDeTreinamento {
    private int experiencia;

    public SessaoDeTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        System.out.println("Jogador treinando: " + jogador.getNome());
        System.out.println("Experiencia antes de treinar: " + jogador.getExperiencia());
        if(jogador.correr() && jogador.fazerGol() && jogador.correr()){
            jogador.setExperiencia(jogador.getExperiencia() + this.experiencia);
            System.out.println("Experiencia depois de treinar: " + jogador.getExperiencia() + "\n\n");
        } else {
            System.out.println("Experiencia não muda pois o jogador não concluiu o treinamento\n\n");
        }
    }
}
