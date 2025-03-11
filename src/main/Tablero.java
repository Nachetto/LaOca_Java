package main;

/**
 * main.Tablero
 */
public class Tablero {
    private Casilla tablero[]= new Casilla[96];
    public Tablero() {
        tablero[10]=new Bici("B");
        tablero[40]=new Bici("B");
        tablero[60]=new Bici("B");
        tablero[66]=new Bici("B");
        tablero[16]=new Atajo("A");
        tablero[32]=new Atajo("A");
        tablero[48]=new Atajo("A");
        tablero[64]=new Atajo("A");
        tablero[80]=new Atajo("A");
        tablero[14]=new Mercadillo("M");
        tablero[30]=new Mercadillo("M");
        tablero[46]=new Mercadillo("M");
        tablero[62]=new Mercadillo("M");
        tablero[78]=new Mercadillo("M");
        tablero[94]=new DebesReiniciar("D");
    }

    public void pintarTablero(){
        System.out.println("TABLERO:\n  0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15\n");
        for (int i = 0; i < 16; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n\n 16   17   18   19   20   21   22   23   24   25   26   27   28   29   30   31\n");
        for (int i = 16; i < 32; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n\n 32   33   34   35   36   37   38   39   40   41   42   43   44   45   46   47\n");
        for (int i = 32; i < 48; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n\n 48   49   50   51   52   53   54   55   56   57   58   59   60   61   62   63\n");
        for (int i = 48; i < 64; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n\n 64   65   66   67   68   69   70   71   72   73   74   75   76   77   78   79\n");
        for (int i = 64; i < 80; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n\n 80   81   82   83   84   85   86   87   88   89   90   91   92   93   94   95\n");
        for (int i = 80; i < tablero.length; i++) {
            if (tablero[i]!=null)
            System.out.printf("[ "+tablero[i].getNombre()+" ]");
            else
            System.out.printf("[   ]");
        }
        System.out.println("\n");
    }
    
    public String hayAlgo(int posicion){
        if (tablero[posicion]!=null){
            return tablero[posicion].getNombre();
        }
        else
        return "no";
    }
}