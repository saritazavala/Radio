import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RadioTest{

	@Test
	void testEncender() {
		Radio test = new Radio();
		boolean encenderTest = test.encendidoRadio();
		assertEquals(true, encenderTest);
	}
	
	@Test
	void testSubirFrecuencia() {
		Radio test = new Radio();
		double result = test.subirFrecuencia();
		assertEquals(540, result);
	}
	
	@Test
	void testSetFavorito() {
		Radio test = new Radio();
		double [] favoritos = new double [12];
		favoritos[4] = 530;
		test.setFavorito(5);
		assertArrayEquals(favoritos, test.favoritos);
	}
}
