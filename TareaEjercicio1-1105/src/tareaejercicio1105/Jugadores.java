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
/**
 * @author Marina
 */
public class Jugadores {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getCantPartidos() {
        return cantPartidos;
    }

    public void setCantPartidos(int cantPartidos) {
        this.cantPartidos = cantPartidos;
    }

    public double getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }
    
    private String nombre;
    private int posicion;
    private int numeroCamiseta;
    private int cantPartidos;
    private int estadoFisico;
    
}
