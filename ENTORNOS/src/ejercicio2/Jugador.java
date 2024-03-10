package ejercicio2;

public class Jugador {
    private String nombre;
    private int puntuacion;
    
    /**
     * 
     * @param nombre  		Nombre del jugador
     * @param puntuacion	Cantidad de puntos que tendrá el jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }
    /**
     * 
     * @param puntos  La puntuación aumenta o disminuye dependiendo de los puntos
     */
    public void incrementarPuntuacion(int puntos) {
        this.puntuacion += puntos;
    }
    /**
     * Nos devolverá el nombre
     * 
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nos devolverá la puntuación
     * 
     * @return Puntuación
     */
    public int getPuntuacion() {
        return puntuacion;
    }
}
