package lab6_luisrápalo;
public class Alimentos {
    private String nombre;
    private int costo, calorias;
    private Categoria c = new Categoria();

    public Alimentos() {
    }

    public Alimentos(String nombre, int costo, int calorias) {
        this.nombre = nombre;
        this.costo = costo;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getc() {
        return c;
    }

    public void setc(Categoria c) {
        this.c = c;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimentos{" + "nombre=" + nombre + ", categoria=" + c + ", costo=" + costo + ", calorias=" + calorias + '}';
    }
    
}
