package lab6_luisrápalo;

import java.util.ArrayList;

public class Jugadores {
    private String nombre;
    private Alimentos a = new Alimentos();
    private int nivel, puntos;
    private ArrayList amigosgordos = new ArrayList ();
    private ArrayList solicitudes = new ArrayList ();
    private Billetera b = new Billetera();

    public Jugadores() {
    }

    public Jugadores(String nombre, int nivel, int puntos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alimentos geta() {
        return a;
    }

    public void seta(Alimentos a) {
        this.a = a;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList getAmigosgordos() {
        return amigosgordos;
    }

    public void setAmigosgordos(ArrayList amigosgordos) {
        this.amigosgordos = amigosgordos;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Billetera getB() {
        return b;
    }

    public void setB(Billetera b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", alimento=" + a + ", nivel=" + nivel + ", puntos=" + puntos + ", amigosgordos=" + amigosgordos + ", solicitudes=" + solicitudes + ", billetera=" + b + '}';
    }
    
}
