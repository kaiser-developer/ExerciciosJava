package Futebol;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public boolean fazerGol(){
        if(this.energia >= 5){
            this.energia -= 5;
            this.alegria += 10;
            this.gols += 1;
            System.out.println("GOOOL!");
            return true;
        }
        System.out.println("Jogador cansado não marca gol!");
        return false;
    }

    public boolean correr() {
        if(this.energia >= 10){
            this.energia -= 10;
            System.out.println("Estou correndo.");
            if(this.energia < 10){
                System.out.println("Cansei");
            }
            return true;
        }
        System.out.println("Estou cansado, não posso correr");
        return false;
    }
}
