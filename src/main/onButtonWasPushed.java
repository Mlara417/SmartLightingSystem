package main;

import static org.junit.jupiter.api.Assertions.*;
import main.*;

import org.junit.jupiter.api.Test;

public class onButtonWasPushed {
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
		assertTrue(remoteControl.onButtonWasPushed(0));
	}

}