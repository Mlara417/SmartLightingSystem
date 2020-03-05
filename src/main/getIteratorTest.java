package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.ColorRepository;

public class getIteratorTest {

	@Test
	public void getiteratortest() {
		ColorRepository junit = new ColorRepository();
		Iterator result = junit.getIterator();
		assertNotNull(result);
	
	}
	

}
