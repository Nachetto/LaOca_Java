# CarreraEnJava
 He creado un juego en java que simula la oca, el primero en llegar a la casilla 95 gana.
# Enunciado:
Los jugadores participan en el MaratónQuevedo cuyo objetivo es llegar los primeros a la meta.
Reglas del juego
Cada jugador tira el dado, que tiene veinte caras, en su turno y mueve su ficha el número de casillas
que indica el dado, con el fin de avanzar hacia la meta, casilla número 95. Considerando la salida la
casilla 0.
CASILLAS
En función del tipo de casilla en la que caiga la ficha del jugador ocurrirá lo siguiente:
CorreCorre: simplemente se comunica al usuario: “Corre corre que te pillan”. Se cambia el turno.
Bici (P): el jugador coge una bici con lo que avanza el doble de casillas por tirada, a partir del
momento en el que cae en esa casilla. Se comunica al usuario: “No hay quien te pare”. Se cambia el
turno.
Mercadillo (M): un mercadillo improvisado, obliga al jugador a retroceder 10 puestos y a estar un
turno sin jugar para buscar una ruta alternativa. Se comunica al usuario: “Pero dónde vas?”
Atajo (A): el corredor ataja saltando a la siguiente casilla de atajo. Se comunica al usuario: “De
atajo en atajo porque eres el más majo”. Vuelve a tirar.
DrogasNo (D): el corredor debe volver a empezar. “Drogas no”. El usuario vuelve a la casilla de
partida, a la casilla 0. Se cambia el turno.
La casilla final, 95, sólo puede ser alcanzada con tirada exacta. Si al tirar el dado sale un número
mayor, rebotará hacia atrás una vez que llegues a la casilla final.
Al inicio del juego el programa pedirá los nombres de los dos jugadores. Empezará el jugador cuyo
nombre sea el primero introducido. El dado será simulado por el programa. En cada jugada se
indicará “Turno de ...”, se mostrará el contenido del tablero y el nombre de los jugadores y el
número de la casilla que ocupan.
El tablero se colocará de la siguiente forma y se imprimirá así con el fin de facilitar el seguimiento
del juego:
  0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15  

[ S ][   ][   ][   ][   ][   ][   ][   ][   ][   ][ B ][   ][   ][   ][ M ][   ]

 16   17   18   19   20   21   22   23   24   25   26   27   28   29   30   31  

[ A ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][ M ][   ]

 32   33   34   35   36   37   38   39   40   41   42   43   44   45   46   47  

[ A ][   ][   ][   ][   ][   ][   ][   ][ B ][   ][   ][   ][   ][   ][ M ][   ]

 48   49   50   51   52   53   54   55   56   57   58   59   60   61   62   63  

[ A ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][ B ][   ][ M ][   ]

 64   65   66   67   68   69   70   71   72   73   74   75   76   77   78   79  

[ A ][   ][ B ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][ M ][   ]

 80   81   82   83   84   85   86   87   88   89   90   91   92   93   94   95  

[ A ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][   ][ D ][ F ]


S Salida
F Final
D DrogasNo
A Atajo
M Mercadillo
B Bici
PROGRAMACIÓN 2 EVALUACIÓN
Jugador1: Fulanito, casilla 56
Jugador2: Menganito, casilla 59
Turno de Fulanito
¿Desea continuar? (s/n)
s
Dado: 4
Casilla nueva 60
No hay quien te pare
Jugador1: Fulanito, casilla 60
Jugador2: Menganito, casilla 59
Turno de Menganito
¿Desea continuar? (s/n)
s
Dado: 5
Casilla nueva 64
De atajo en atajo porque eres el más majo
Jugador1: Fulanito, casilla 60
Jugador2: Menganito, casilla 80
Turno de Menganito
¿Desea continuar? (s/n)
s
Dado: 14
Casilla nueva 94
Drogas no
Jugador1: Fulanito, casilla 60
Jugador2: Menganito, casilla 0
Turno de Fulanito
¿Desea continuar? (s/n)
s
Dado: 10
Casilla nueva 80
De atajo en atajo porque eres el más majo
Enhorabuena Fulanito!!
Puntuación:
La aplicación deberá ser desarrollada en java utilizando la POO.
• Diseño de clases (atributos, métodos): 1,5p
• Herencia (constructores y resto de métodos): 2,5p
• Polimorfismo: 2 p
• Desarrollar una clase que contenga el tablero de juego y otra que gestione el turno, tal y
como se ha realizado el ajedrez en clase. 1,5p
• Lógica juego 2,5p
Se entregará una hoja explicando cómo se han realizado los cuatro puntos anteriores y cualquier
otra consideración tenida en cuenta.