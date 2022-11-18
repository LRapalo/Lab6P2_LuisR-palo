package lab6_luisrápalo;
public class Billetera{
    private int costo, max_puntos;

    public Billetera() {
    }

    public Billetera(int costo, int max_puntos) {
        this.costo = costo;
        this.max_puntos = max_puntos;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getMax_puntos() {
        return max_puntos;
    }

    public void setMax_puntos(int max_puntos) {
        this.max_puntos = max_puntos;
    }

    @Override
    public String toString() {
        return "Billetera{" + "costo=" + costo + ", max_puntos=" + max_puntos + '}';
    }
    
}
