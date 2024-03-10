package ejercicio2;

public class VideoJuegoApp {

	public static void main(String[] args) {
		Jugador jugador = new Jugador("Alex");
		Videojuego juego = new Videojuego("Super Juego Aventura");
		/**
		 * Le damos una puntuación de 100
		 */
		juego.asignarJugador(jugador);
		jugador.incrementarPuntuacion(100);
		/**
		 * Imprimimos el nombre del jugador
		 * Imprimimos la puntuación
		 * Imrpimimos el nombre del videojuego
		 */
		System.out.println("Jugador: " + juego.getJugador().getNombre());
		System.out.println("Puntuación: " + juego.getJugador().getPuntuacion());
		System.out.println("Jugando: " + juego.getTitulo());
	}

}
