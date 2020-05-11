/*
1. Agregar a la clase Equipo (unidad 1) un arreglo con los datos de los jugadores.
De cada jugador se conoce su nombre, posición (1: arquero, 2: defensor, 3:
mediocampo, 4: delantero) número de camiseta, cantidad de partidos jugados y
porcentaje de estado físico (100 equivale a un jugador sano y 0 a uno imposibilitado
de jugar por lesiones).
Desarrollar un programa que permita cargar todos los datos de un equipo y a
continuación informe:
1. Cantidad de jugadores con menos de 10 partidos jugados.
2. Nombre del jugador con mayor cantidad de partidos jugados.
3. Promedio de estado físico de todo el equipo.
4. Estado físico de un jugador particular identificado por número de camiseta.
5. Promedio de partidos jugados de los jugadores de cada posición (4
resultados).
 */
package tareaejercicio1105;

import java.util.List;

/**
 * @author Marina
 */
public class Equipo {
  private String nombre; 
  private List<Jugadores> equipo;

    public List<Jugadores> getEquipo() {
        return equipo;
    }
    public void setEquipo(List<Jugadores> equipo) {
        this.equipo = equipo;
    }
    public String getName() {
      return nombre;
    }
    public void setName(String newName) {
      this.nombre = newName;
    }
  

  
}
