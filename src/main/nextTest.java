package main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;

@RunWith(JUnitPlatform.class)
public class nextTest {

	@Test
	public void nexttest1() {
		Iterator result;
		String expected = "red";
		ColorRepository colorrepo = new ColorRepository();
		result = colorrepo.getIterator();
		assertEquals(expected, result.next());
		
	}

}