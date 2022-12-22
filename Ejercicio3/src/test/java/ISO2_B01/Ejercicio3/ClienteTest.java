package ISO2_B01.Ejercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void testSetEdadNegativa() {
		
		int edad = -26;
		try {
			Cliente c = new Cliente("Pepito", "Grillo", edad, true, false);
		}catch(ExceptionEdad e) {
			assertEquals(e.getMessage(),"La edad debe ser un número positivo.");
		}
	}

	@Test
	public void testSetEdadValida() {
		
		int edad = 12;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 0,true,false);
			c.setEdad(edad);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente SI es válida.");
		}
	}
	
	@Test
	public void testSetEstudia() {
		
		boolean estudia = true;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 17,true,false);
			c.setEstudia(estudia);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente implica que estudia");
		}
	}
	
	@Test
	public void testSetIndependizado() {
		
		boolean independizado = false;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 17, true, false);
			c.setIndependizado(independizado);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente implica que no está independizado");
		}
	}
	
	@Test
	public void testGetEdad() {
		
		int edad = 17;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 17, true, false);
			assertEquals(c.getEdad(),edad);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente es válida.");
		}
	}
	
	@Test
	public void testIsEstudia() {
		
		boolean estudia = false;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 17, false, false);
			assertEquals(c.isEstudia(),estudia);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente implica que estudia.");
		}
	}
	
	@Test
	public void testIsIndependizado() {
		
		boolean independizado = false;
		
		try {
			Cliente c = new Cliente("Pepito", "Grillo", 17, true, false);
			assertEquals(c.isIndependizado(),independizado);
		}catch(ExceptionEdad e) {
			fail("Falso error. La edad del cliente implica que no está independizado");
		}
	}
	
	
}
