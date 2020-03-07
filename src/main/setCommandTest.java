package main;

import main.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class setCommandTest {
	RoomFactory factory = new RoomFactory();
	Home home = new Home(factory);
	Room garage = home.createRoom("Garage", 1);
	RemoteControl remoteControl = new RemoteControl();
	Light garageLight = new Light(garage.getName());
	LightOn garageLightOn = 
			new LightOn(garageLight);
	LightOff garageLightOff = 
			new LightOff(garageLight);
	
	@Test
	public void setCommandTest() {
		assertTrue(remoteControl.setCommand(0, garageLightOn, garageLightOff));
	}
	
	

}
