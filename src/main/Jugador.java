package main;

public class Jugador extends Casilla {
    private String nombre;
    private int posicion,turno;
    private boolean tengobici,estoyenmercado;

    Jugador(String nombre, int turno) {
        super(nombre);
        this.nombre=nombre;
        this.posicion=0;
        this.turno=turno;
        this.tengobici=false;
        this.estoyenmercado=false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setTengobici(boolean tengobici) {
        this.tengobici = tengobici;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isTengobici() {
        return tengobici;
    }

    public boolean isEstoyenmercado() {
        return estoyenmercado;
    }

    public void setEstoyenmercado(boolean estoyenmercado) {
        this.estoyenmercado = estoyenmercado;
    }

    
}