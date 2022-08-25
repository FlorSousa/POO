package aula2;

public class main {
    public static void main(String[] args) {
        Lobo lobo = new Lobo("Jacob");
        Gato gato = new Gato("Mingau");
        lobo.locomove();
        gato.locomove();
        lobo.som();
        gato.som();
    }
}
