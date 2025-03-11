package main;

import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Tablero tb = new Tablero();
        Juego game = new Juego();
        game.crearJugadores();
        tb.pintarTablero();
        while (!game.getFinPartida()) {
            if(game.isNuevociclo())
            tb.pintarTablero();
            System.out.println(game.getJugador(game.getTurno()-1).getNombre()+", te toca: estas en la main.Casilla "+game.getJugador(game.getTurno()-1).getPosicion());
            game.tirarDado();System.out.println("¿Desea continuar? (s/n)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                game.moverJugador(tb);
            }
            System.out.println("\n");
            game.cambiarTurno();
        }
        sc.close();
    }
}
