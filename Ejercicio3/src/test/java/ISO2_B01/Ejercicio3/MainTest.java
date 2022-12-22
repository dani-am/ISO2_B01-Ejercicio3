package ISO2_B01.Ejercicio3;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest{

	@Test
	public void PrimerTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(15);
			c.setEstudia(true);
			c.setIndependizado(false);

			String s = "Cuenta vamos que tú puedes";

			assertEquals(Main.tipoCuenta(c), s);
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}
	@Test
	public void SegundoTest() {

		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(1);
			c.setEstudia(false);
			c.setIndependizado(true);

			String s = "Cuenta Bienvenido a la vida adulta";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void TercerTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(1);
			c.setEstudia(true);
			c.setIndependizado(true);

			String s = "Cuenta Vamos que tú puedes";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void CuartoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(1);
			c.setEstudia(true);
			c.setIndependizado(false);

			String s = "Cuenta Confort";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void QuintoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(26);
			c.setEstudia(false);
			c.setIndependizado(true);

			String s = "Cuenta Bienvenido a la vida adulta";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void SextoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(26);
			c.setEstudia(true);
			c.setIndependizado(false);

			String s = "No es posible asignar una cuenta al cliente" + c.getNombre() + " " + c.getApellidos();

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void SeptimoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(19);
			c.setEstudia(false);
			c.setIndependizado(false);

			String s = "Cuenta ahorra ahora que puedes";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void OctavoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(19);
			c.setEstudia(true);
			c.setIndependizado(true);

			String s = "No es posible asignar una cuenta al cliente" + c.getNombre() + " " + c.getApellidos();

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void NovenoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(26);
			c.setEstudia(true);
			c.setIndependizado(true);

			String s = "No es posible asignar una cuenta al cliente" + c.getNombre() + " " + c.getApellidos();

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void DecimoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(19);
			c.setEstudia(true);
			c.setIndependizado(false);

			String s = "No es posible asignar una cuenta al cliente" + c.getNombre() + " " + c.getApellidos();

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}

	@Test
	public void UndecimoTest() {
		try {
			Cliente c = new Cliente();
			c.setNombre("Pepito");
			c.setApellidos("Grillo");
			c.setEdad(19);
			c.setEstudia(false);
			c.setIndependizado(true);

			String s = "Cuenta Saltando del nido";

			assertEquals(s, Main.tipoCuenta(c));
		} catch (ExceptionEdad e) {
			fail("Falso error. Edad correcta.");
		}
	}
}
