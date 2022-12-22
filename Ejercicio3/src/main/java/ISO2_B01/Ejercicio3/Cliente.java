package ISO2_B01.Ejercicio3;

public class Cliente {
	
	//Atributos
	String nombre;
	String apellidos;
	int edad;
	boolean estudia;
	boolean independizado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) throws ExceptionEdad {
		if (edad < 0)
			throw new ExceptionEdad("La edad debe ser un número positivo.");
		this.edad = edad;
	}
	public boolean isEstudia() {
		return estudia;
	}
	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}
	public boolean isIndependizado() {
		return independizado;
	}
	public void setIndependizado(boolean independizado) {
		this.independizado = independizado;
	}
	
	//Constructor
	
	public Cliente() {
		
	}
	
	public Cliente (String nombre, String apellidos, int edad, boolean est, boolean ind) throws ExceptionEdad{
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		setEstudia(est);
		setIndependizado(ind);
	}
}
