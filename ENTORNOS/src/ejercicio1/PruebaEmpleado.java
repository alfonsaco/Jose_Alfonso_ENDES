package ejercicio1;

public class PruebaEmpleado {

	/**
	 * 
	 * @param args  Main que contiene los datos de un empleaod, para imprimirlo con un print
	 */
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 30, "Finanzas");
		System.out.println("Empleado: " + empleado.getNombre() + ", Edad: " + empleado.getEdad() + ", Departamento: "
				+ empleado.getDepartamento());
	}

}
