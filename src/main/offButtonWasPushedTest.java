package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;
import org.junit.jupiter.api.Test;

@RunWith(JUnitPlatform.class)
public class offButtonWasPushedTest {
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
	public void test() {
		assertTrue(remoteControl.offButtonWasPushed(0));
	}

}