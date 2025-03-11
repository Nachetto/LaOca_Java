# 🏁 CarreraEnJava  

Un juego en Java que simula el clásico juego de la Oca. El objetivo es ser el primero en llegar a la casilla 95.  

## 📜 Enunciado  

Los jugadores participan en el **MaratónQuevedo**, cuyo objetivo es llegar los primeros a la meta.  

### 🎲 Reglas del juego  

- Cada jugador lanza un **dado de 20 caras** en su turno y avanza el número de casillas indicado.  
- La **meta** está en la casilla **95**, y la salida en la casilla **0**.  
- Si un jugador **supera la casilla 95**, rebotará hacia atrás.  
- El programa solicita los nombres de los jugadores al inicio.  
- El jugador cuyo nombre se introduzca primero **empieza**.  
- El dado es simulado por el programa.  
- En cada turno, se muestra el tablero, la posición de los jugadores y el resultado del dado.  

### 🔥 Tipos de Casillas  

| main.Casilla       | Efecto                                                                                                     |
|--------------|------------------------------------------------------------------------------------------------------------|
| **CorreCorre** | No ocurre nada, se cambia el turno. *"Corre corre que te pillan."*                                         |
| **main.Bici (B)** | El jugador avanza **el doble de casillas** por tirada. *"No hay quien te pare."*                           |
| **main.Mercadillo (M)** | Retrocede **10 casillas** y pierde **1 turno**. *"¿Pero dónde vas?"*                                       |
| **main.Atajo (A)** | Salta a la **siguiente casilla de atajo** y vuelve a tirar. *"De atajo en atajo porque eres el más majo."* |
| **main.DebesReiniciar (D)** | Vuelve a la casilla **0**. *"Debes reiniciar."*                                                            |

### 📌 main.Tablero  

```txt
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
```
## 🕹 Ejemplo de main.Juego  

```txt
Jugador1: Fulanito, casilla 56  
Jugador2: Menganito, casilla 59  

Turno de Fulanito  
¿Desea continuar? (s/n)  
s  

Dado: 4  
main.Casilla nueva 60  
No hay quien te pare  

Jugador1: Fulanito, casilla 60  
Jugador2: Menganito, casilla 59  

Turno de Menganito  
¿Desea continuar? (s/n)  
s  

Dado: 5  
main.Casilla nueva 64  
De atajo en atajo porque eres el más majo  

Jugador1: Fulanito, casilla 60  
Jugador2: Menganito, casilla 80  

Turno de Menganito  
¿Desea continuar? (s/n)  
s  

Dado: 14  
main.Casilla nueva 94  
Debes Reiniciar  

Jugador1: Fulanito, casilla 60  
Jugador2: Menganito, casilla 0  

Turno de Fulanito  
¿Desea continuar? (s/n)  
s  

Dado: 10  
main.Casilla nueva 80  
De atajo en atajo porque eres el más majo  

🎉 **¡Enhorabuena Fulanito!** 🎉  
```

---

## 🚀 Instalación y Uso  

1. Clona el repositorio:  
   ```sh
   git clone https://github.com/Nachetto/LaOca_Java.git
   ```
2. Compila el código:  
   ```sh
   javac CarreraEnJava.java
   ```
3. Ejecuta el juego:  
  ```sh
   java CarreraEnJava
  ```

### 🏆 ¡Que gane el mejor corredor! 🏆  

