import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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

	@Test //constructores
	public void testTren() {

		assertEquals(TIPO, tren.getTipo());
		assertEquals(REFERENCIA, tren.getReferencia());
		assertEquals(ASIENTOS, tren.getAsientosOcupados());
		assertEquals(TIPO, tren.getAnosActivo());
		
		Tren tNull = new Tren(null, 0, -5, 0);
		assertEquals(TIPO, tNull.getTipo());
		assertEquals(REFERENCIA, tNull.getReferencia());
		assertEquals(ASIENTOS, tNull.getAsientosOcupados());
		assertEquals(TIPO, tNull.getAnosActivo());
	}

	@Test
	public void testTrenStringIntIntInt() {
		fail("Not yet implemented");
	}

	//getters y setters
	@Test
	public void testGetTipo() {
		
		assertEquals(TIPO, tren.getTipo());
	}

	@Test
	public void testSetTipo() {
		
		tren.setTipo("algo");
		assertEquals("algo", tren.getTipo());
	}

	@Test
	public void testGetReferencia() {

		assertEquals(REFERENCIA, tren.getReferencia());
	}

	@Test
	public void testSetReferencia() {

		tren.setReferencia(7458);
		assertEquals(7458, tren.getReferencia());
		
		tren.setReferencia(0);
		assertEquals(0, tren.getReferencia());
	}

	@Test
	public void testGetAsientosOcupados() {

		assertEquals(ASIENTOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {

		tren.setAsientosOcupados(-1);
		assertEquals(-1, tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA+1);
		assertEquals(Tren.CAPACIDAD_MAXIMA+1, tren.getAsientosOcupados());
	}

	@Test
	public void testGetAnosActivo() {
		
		assertEquals(ANOS, tren.getAnosActivo());
	}

	@Test
	public void testSetAnosActivo() {
		
		tren.setAnosActivo(-1);
		assertEquals(7458, tren.getAnosActivo());
		
		tren.setAnosActivo(Tren.EDAD_MAXIMA+1);
		assertEquals(Tren.EDAD_MAXIMA+1, tren.getAnosActivo());
	}

	
	@Ignore // ignora el test y lo salta JUnit
	public void testMostrarDatos() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrenLleno() {

		assertFalse(tren.TrenLleno());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA);
		assertTrue(tren.TrenLleno());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA+1);
		assertFalse(tren.TrenLleno());
	}

	@Test
	public void testDemasiadoViejo() {
		assertFalse(tren.DemasiadoViejo());
		
		tren.setAsientosOcupados(Tren.EDAD_MAXIMA);
		assertTrue(tren.DemasiadoViejo());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA+1);
		assertFalse(tren.DemasiadoViejo());
	}

}
