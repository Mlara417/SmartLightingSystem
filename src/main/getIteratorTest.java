package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import main.ColorRepository;

@RunWith(JUnitPlatform.class)
public class getIteratorTest {

	@Test
	public void getiteratortest() {
		ColorRepository junit = new ColorRepository();
		Iterator result = junit.getIterator();
		assertNotNull(result);
	
	}
	

}
