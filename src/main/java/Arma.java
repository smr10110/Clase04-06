public class Arma {
    private String nombre;
    private int poderDeAtaque;
    private TipoDeDano tipoDeDano; // Enumerado para tipo de daño

    public Arma(String nombre, int poderDeAtaque, TipoDeDano tipoDeDanio) {
        this.nombre = nombre;
        this.poderDeAtaque = poderDeAtaque;
        this.tipoDeDano = tipoDeDanio;
    }

    public int getPoderAtaque() {
        return poderDeAtaque;
    }
}

