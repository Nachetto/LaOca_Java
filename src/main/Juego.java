package main;

import java.util.Scanner;

public class Juego {
    private int dado, turno;
    private boolean finpartida, nuevociclo;
    Jugador[] jugador = new Jugador[2];

    public Juego() {
        this.dado = 0;
        this.finpartida = false;
    }

    public int getDado() {
        return dado;
    }

    public boolean getFinPartida() {
        return finpartida;
    }

    public void setFinpartida(boolean finpartida) {
        this.finpartida = finpartida;
    }

    public int getTurno() {
        return turno;
    }

    public Jugador getJugador(int numero) {
        return jugador[numero];
    }

    public boolean isNuevociclo() {
        return nuevociclo;
    }
    public void crearJugadores() {
        Scanner sc = new Scanner(System.in);
        turno = 1;
        while (turno != 3) {
            System.out.println("Introduzca el nombre del " + turno + "º jugador, por favor");
            String nuevonombre = sc.nextLine();
            jugador[turno - 1] = new Jugador(nuevonombre, turno);
            turno++;
        }
        turno = 1;
    }

    public int tirarDado() {
        dado = (int) (Math.random() * 21) + 1;
        System.out.println("El dado ha sacado un " + dado);
        if (jugador[turno - 1].isTengobici()) {
            System.out.println("Como tienes la bici, vas el doble de rapido");
            dado = dado * 2;
        }
        return dado;
    }

    public void cambiarTurno() {
        nuevociclo=false;
        if (jugador[turno - 1].isEstoyenmercado()) {
            jugador[turno - 1].setEstoyenmercado(false);
        } else {
            turno++;
            if (turno > 2) {
                turno = 1;
                nuevociclo=true;
            }
        }
    }

    public void moverJugador(Tablero tb) {

        if (jugador[turno - 1].getPosicion() + dado == 95) {
            System.out.println("ENHORABUENA " + jugador[turno - 1].getNombre().toUpperCase() + "!!!! HAS GANADO!!!");
            setFinpartida(true);
        }else if((jugador[turno - 1].getPosicion() + dado > 95)){
            int rebote=dado-(96-jugador[turno - 1].getPosicion());
            jugador[turno - 1].setPosicion(jugador[turno - 1].getPosicion() - rebote);
            System.out.println("Hey! Que te pasas del limite! REBOTAS "+rebote+" CASILLAS, pasas a la nº"+jugador[turno - 1].getPosicion());

        }else if (tb.hayAlgo(jugador[turno - 1].getPosicion() + dado) != "no") {
            if (tb.hayAlgo(jugador[turno - 1].getPosicion() + dado).equalsIgnoreCase("B")) {
                jugador[turno - 1].setTengobici(true);
                System.out.println("Has cogido la bici! Irás el doble de rapido.");
                jugador[turno - 1].setPosicion(jugador[turno - 1].getPosicion() + dado);
                System.out.println("Pasas a la casilla " + jugador[turno - 1].getPosicion());
            }
            if (tb.hayAlgo(jugador[turno - 1].getPosicion() + dado).equalsIgnoreCase("A")
                    && jugador[turno - 1].getPosicion() + dado != 80) {
                System.out.println("DE ATAJO EN ATAJO PORQUE ERES EL MAS MAJO\nVuelves a tirar.");
                jugador[turno - 1].setPosicion(jugador[turno - 1].getPosicion() + dado + 16);
                System.out.println("Pasas a la casilla " + jugador[turno - 1].getPosicion());
                cambiarTurno();
            }
            if (tb.hayAlgo(jugador[turno - 1].getPosicion() + dado).equalsIgnoreCase("M")) {
                System.out.println("A DONDE VAS?? TE HAS ENCONTRADO AL MERCADILLO\nUn turno sin tirar.");
                if (jugador[turno - 1].getPosicion() > 10) {
                    jugador[turno - 1].setPosicion(jugador[turno - 1].getPosicion() + dado - 10);
                    jugador[turno - 1].setEstoyenmercado(true);
                } else {
                    jugador[turno - 1].setPosicion(0);
                    jugador[turno - 1].setEstoyenmercado(true);
                }
                System.out.println("Pasas a la casilla " + jugador[turno - 1].getPosicion());
                cambiarTurno();
            }
            if (tb.hayAlgo(jugador[turno - 1].getPosicion() + dado).equalsIgnoreCase("D")) {
                System.out.println("Al principio crack");
                jugador[turno - 1].setPosicion(0);
                System.out.println("Pasas a la casilla " + jugador[turno - 1].getPosicion());
                cambiarTurno();
            }
        } else {
            jugador[turno - 1].setPosicion(jugador[turno - 1].getPosicion() + dado);
            System.out.println("Pasas a la casilla " + jugador[turno - 1].getPosicion());
        }
    }
}