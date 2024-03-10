package ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    /**
     * 
     *  @param nombre  Nombre de la persona
     *  @param edad    Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /** 
     *  Nos devuelve el nombre
     *  
     *  @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *  Nos devuelve la edad
     * 
     *  @return
     */
    public int getEdad() {
        return edad;
    }
}
