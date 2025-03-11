package main;

/**
 * main.Casilla
 */
public abstract class Casilla {
    private String nombre;
    
    public Casilla(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}