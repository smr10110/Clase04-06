public abstract class Personaje {
    protected String nombre;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected Arma arma;
    protected Pocion pocion;

    public Personaje(String nombre, int hp, int ataque, int defensa, Arma arma, Pocion pocion) {
        this.nombre = nombre;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.arma = arma;
        this.pocion = pocion;
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    public void recibirDano(int dano) {
        hp -= dano;
    }

    public abstract void atacar(Personaje otro);
    public abstract int calcularDano();
}
