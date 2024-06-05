import java.util.Random;

public class Juego {
    private Random random = new Random();

    public void iniciarCombate(Personaje p1, Personaje p2) {
        Personaje atacante, defensor;

        // Decidir aleatoriamente quién ataca primero
        if (random.nextBoolean()) {
            atacante = p1;
            defensor = p2;
        } else {
            atacante = p2;
            defensor = p1;
        }

        while (p1.estaVivo() && p2.estaVivo()) {
            realizarTurno(atacante, defensor);
            // Intercambiar roles
            Personaje temp = atacante;
            atacante = defensor;
            defensor = temp;
        }

        mostrarGanador(p1, p2);
    }

    private void realizarTurno(Personaje atacante, Personaje defensor) {
        int danoBase = atacante.calcularDano();
        // Añadir un factor de aleatoriedad al daño
        int dano = danoBase + random.nextInt(6); // Añade de 0 a 5 puntos de daño extra

        defensor.recibirDano(dano);
        System.out.println(atacante.nombre + " ataca a " + defensor.nombre + " causando " + dano + " de daño.");

        // Usar la poción si la vida del defensor cae por debajo de 10
        if (defensor.hp < 10 && defensor.pocion != null) {
            int curacion = defensor.pocion.getCuracion();
            defensor.hp += curacion;
            System.out.println(defensor.nombre + " usa una poción y cura " + curacion + " puntos de vida.");
        }
    }

    private void mostrarGanador(Personaje p1, Personaje p2) {
        if (!p1.estaVivo() && !p2.estaVivo()) {
            System.out.println("Ambos personajes han caído, el combate termina en empate.");
        } else if (!p1.estaVivo()) {
            System.out.println(p2.nombre + " gana el combate!");
        } else if (!p2.estaVivo()) {
            System.out.println(p1.nombre + " gana el combate!");
        }
    }
}
