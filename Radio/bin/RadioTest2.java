import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest2 {

	@Test
	void test() {
		Radio test = new Radio();
		double result = test.subirFrecuencia();
		assertEquals(540, result);
	}

}
