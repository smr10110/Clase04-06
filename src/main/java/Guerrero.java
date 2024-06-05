public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int hp, int ataque, int defensa, Arma arma, Pocion pocion, int fuerza) {
        super(nombre, hp, ataque, defensa, arma, pocion);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje otro) {
        otro.recibirDano(calcularDano());
    }

    @Override
    public int calcularDano() {
        return ataque + arma.getPoderAtaque() + fuerza;
    }
}