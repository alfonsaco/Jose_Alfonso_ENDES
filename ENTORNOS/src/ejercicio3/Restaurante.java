package ejercicio3;

public class Restaurante {
    private String nombre;
    private Plato[] menu;
    /**
     * @author Fonsi
     * 
     * 
     * @param nombre  Nombre del restaurante
     * @param menu    Menu del restaurante
     */
    public Restaurante(String nombre, Plato[] menu) {
        this.nombre = nombre;
        this.menu = menu;
    }
    /**
     * 
     * @return  Nombre del restaurante
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @return  Menú del restarurante
     */
    public Plato[] getMenu() {
        return menu;
    }
}
