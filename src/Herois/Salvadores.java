package Herois;

public class Salvadores {
    public static void main(String[] args) {
        Batman batman = new Batman();
        Superman superman = new Superman();
        Ivo ivo = new Ivo();

        batman.salvarPessoas();
        superman.salvarPessoas();
        ivo.salvarPessoas();
    }
}
