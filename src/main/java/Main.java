public class Main {
    public static void main(String[] args) {
        // Crear armas
        Arma espada = new Arma("Espada Larga", 15, TipoDeDano.FISICO);
        Arma baston = new Arma("Bastón de Magia", 12, TipoDeDano.MAGICO);

        // Crear pociones
        Pocion pocionGuerrero = new Pocion("Poción de Curación", 20);
        Pocion pocionMago = new Pocion("Poción de Vida", 25);

        // Crear personajes
        Guerrero guerrero = new Guerrero("Conan", 100, 10, 5, espada, pocionGuerrero, 7);
        Mago mago = new Mago("Gandalf", 80, 15, 3, baston, pocionMago, 10);

        // Crear el juego
        Juego juego = new Juego();
        juego.iniciarCombate(guerrero, mago);
    }
}
