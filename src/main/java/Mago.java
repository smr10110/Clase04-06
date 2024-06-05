public class Mago extends Personaje {
    private int poderMagico;

    public Mago(String nombre, int hp, int ataque, int defensa, Arma arma, Pocion pocion, int poderMagico) {
        super(nombre, hp, ataque, defensa, arma, pocion);
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar(Personaje otro) {
        otro.recibirDano(calcularDano());
    }

    @Override
    public int calcularDano() {
        return ataque + arma.getPoderAtaque() + poderMagico;
    }
}
