import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrenTest {
	
	Tren tren;
	static final String TIPO = "Locomotora";
	static final int REFERENCIA = 7895;
	static final int ASIENTOS = 3;
	static final int ANOS = 5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tren = new Tren(TIPO,REFERENCIA,ASIENTOS,ANOS);
	}

	@After
	public void tearDown() throws Exception {
		tren = null;
	}

	@Test
	public void testTren() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenStringIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTipo() {
		
		assertEquals("Locomotora", tren.getTipo());
	}

	@Test
	public void testSetTipo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAsientosOcupados() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAñosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAñosActivo() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarDatos() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {
		fail("Not yet implemented");
	}

	@Test
	public void testDemasiadoViejo() {
		assertFalse(tren.DemasiadoViejo());
	}

}
