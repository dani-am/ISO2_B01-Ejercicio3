package ISO2_B01.Ejercicio3;

public class Main {

	public static void main(String[] args){
		Cliente cl = new Cliente();
		cl.setNombre("Pepito");
		cl.setApellidos("Grillo");
		try {
		cl.setEdad(15);
		cl.setEstudia(true);
		cl.setIndependizado(false);
		
		System.out.println(tipoCuenta(cl));
		} catch (ExceptionEdad e) {
		System.out.println("La edad debe ser un número positivo.");
		}
	}

	public static String tipoCuenta(Cliente cl) {
		
		//caso 1: MENOR de edad, ESTUDIANDO y NO INDEPENDIZADO
		if(cl.getEdad()<18 && cl.isEstudia() && !cl.isIndependizado())
			return "Cuenta confort";
		
		//caso 2: MENOR DE 25, ESTUDIANDO e INDEPENDIZADO
		if(cl.getEdad()<25 && cl.isEstudia() && cl.isIndependizado())
			return "Cuenta vamos que tú puedes";
		
		//Caso 3; MAYOR de edad, TRABAJANDO, NO INDEPENDIZADO
		if(cl.getEdad()>18 && !cl.isEstudia())
			if(!cl.isIndependizado())
				return "Cuenta ahorra ahora que puedes";
			else
				return "Cuenta saltando del nido";
		
		//Caso 4: MAYOR de 25, TRABAJANDO, NO INDEPENDIZADO
		if(cl.getEdad()>25 && !cl.isEstudia() && !cl.isIndependizado())
			return "Cuenta independízate que va siendo hora";
		
		//Caso 5: MAYOR de 25, TRABAJANDO, INDEPENDIZADO
		if(cl.getEdad()>25 && !cl.isEstudia() && cl.isIndependizado())
			return "Cuenta bienvenido a la vida adulta";
		
		return "No es posible asignar una cuenta al cliente"+cl.getNombre()+" "+cl.getApellidos();
	}

}
