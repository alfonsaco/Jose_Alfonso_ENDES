package ejercicio2;

public class Videojuego {
    private String titulo;
    private Jugador jugador;
    /**
     * El jugador está presente en la clase jugador
     * 
     * @param titulo  Título del videojuego
     */
    public Videojuego(String titulo) {
        this.titulo = titulo;
        this.jugador = null;
    }
    /**
     * 
     * @param jugador   Le da un valor al jugador
     */
    public void asignarJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    /**
     * 
     * @return  Título del videojuego
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * 
     * @return Nombre del jugador
     */
    public Jugador getJugador() {
        return jugador;
    }
}
