package main;

import java.util.Scanner; //import the scanner

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//factory
		RoomFactory factory = new RoomFactory();
		Home home = new Home(factory);
		Room kitchen = home.createRoom("Kitchen", 2);
		Room garage = home.createRoom("Garage", 4);
		
		//command
		RemoteControl remoteControl = new RemoteControl();
		Light garageLight = new Light(garage.getName());
		Light kitchenLight = new Light(kitchen.getName());
		LightOn garageLightOn = 
				new LightOn(garageLight);
		LightOff garageLightOff = 
				new LightOff(garageLight);
		LightOn kitchenLightOn = 
				new LightOn(kitchenLight);
		LightOff kitchenLightOff = 
				new LightOff(kitchenLight);
		
		//state
		GarageDoor garagedoor = new GarageDoor();
		
		//iteratory pattern 
		ColorRepository colorRepository = new ColorRepository();
		
		remoteControl.setCommand(0, garageLightOn, garageLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		//garagedoor.setState(garagedoor.up);
		
		// using garage state to command lights on or off
		if(garagedoor.getState().toString().equalsIgnoreCase("down")) {
			System.out.println("down");
			remoteControl.onButtonWasPushed(0);
			remoteControl.onButtonWasPushed(1);
			
		} else if(garagedoor.getState().toString().equalsIgnoreCase("up")) {
			System.out.println("up");
			remoteControl.offButtonWasPushed(0);
			remoteControl.offButtonWasPushed(1);
		}		
		
		//choose a color question then output options
		for(Iterator iterator = colorRepository.getIterator(); iterator.hasNext();) {
			String color = (String)iterator.next();
			System.out.println(color);
		}
		
		//check color and call index based on user selection
	}

}
