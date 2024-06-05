public class Santuario {
    private String nombre;
    private int defensaExtra;

    public Santuario(String nombre, int defensaExtra) {
        this.nombre = nombre;
        this.defensaExtra = defensaExtra;
    }

    public int getDefensa() {
        return defensaExtra;
    }
}
