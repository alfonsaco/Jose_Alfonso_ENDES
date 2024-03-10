package ejercicio1;

public class Empleado extends Persona {
    private String departamento;
    
    /**
     * 
     * @param nombre			Nombre del empleado
     * @param edad				Edad del empleado
     * @param departamento		Departamente en el cual trabaja el empleado
     */
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    /**
     * Nos devolverá el departamente
     * 
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }
}