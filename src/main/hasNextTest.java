package main;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;

@RunWith(JUnitPlatform.class)
public class hasNextTest {

	@Test
	public void hasnexttest() {
		Iterator result;
		ColorRepository colorrepo = new ColorRepository();
		result = colorrepo.getIterator();
		assertTrue(result.hasNext());
		
	}

}
