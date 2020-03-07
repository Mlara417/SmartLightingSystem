package main;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import main.ColorRepository;

public class getIteratorTest {

	@Test
	public void getiteratortest() {
		ColorRepository junit = new ColorRepository();
		Iterator result = junit.getIterator();
		assertNotNull(result);
	
	}
	

}
