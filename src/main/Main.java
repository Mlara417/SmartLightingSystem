package main;

import java.util.Scanner; //import the scanner

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int kitchenLights;
		int garageLights;
		String colorOptions;
		String lightColor;
		String garageDoorPosition;
		
		RoomFactory factory;
		Home home;
		Room kitchen;
		Room garage;
		Iterator iterator;
		RemoteControl remoteControl;
		Light garageLight;
		Light kitchenLight;
		LightOn garageLightOn;
		LightOff garageLightOff;
		LightOn kitchenLightOn;
		LightOff kitchenLightOff;
		GarageDoor garagedoor;
		
		
		
		//iterator pattern 
		ColorRepository colorRepository = new ColorRepository();
		
		System.out.println("How many lights for your kitchen?");
		kitchenLights = scan.nextInt();
		System.out.println("");
		
		System.out.println("How many lights for your garage?");
		garageLights = scan.nextInt();
		System.out.println("");
		
		//choose a color question then output options
		System.out.println("What color would you like the lights to be?");
		for(iterator = colorRepository.getIterator(); iterator.hasNext();) {
			colorOptions = (String)iterator.next();
			if(iterator.hasNext() == true) {
				System.out.print(colorOptions + ",");
			} else {
				System.out.print(colorOptions+".");
				System.out.println("");
				
			}
			 
		}
		lightColor = scan.next();
		lightColor.toLowerCase();
		System.out.println("");
		
		//factory
		factory = new RoomFactory();
		home = new Home(factory);
		kitchen = home.createRoom("Kitchen", kitchenLights);
		garage = home.createRoom("Garage", garageLights);
		
		//check color and call index based on user selection
		switch(lightColor) {
		case "red":
			System.out.println("Your lights are red");
			break;
		case "yellow":
			System.out.println("Your lights are yellow");
			break;
		case "green":
			System.out.println("Your lights are green");
			break;
		}
	
		System.out.println("");
		
		//command
		remoteControl = new RemoteControl();
		garageLight = new Light(garage.getName());
		kitchenLight = new Light(kitchen.getName());
		garageLightOn = 
				new LightOn(garageLight);
		garageLightOff = 
				new LightOff(garageLight);
		kitchenLightOn = 
				new LightOn(kitchenLight);
		kitchenLightOff = 
				new LightOff(kitchenLight);
		
		//state
		garagedoor = new GarageDoor();
		
		remoteControl.setCommand(0, garageLightOn, garageLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		//setting initial state
		System.out.println("What is the garage door position?");
		garageDoorPosition = scan.next();
		garageDoorPosition.toLowerCase();
		
		if(garageDoorPosition.equals("up")) {
			garagedoor.setState(garagedoor.up);
		} else if (garageDoorPosition.equals("down")) {
			garagedoor.setState(garagedoor.down);
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("");
		
		// using garage state to command lights on or off
		if(garagedoor.getState().toString().equalsIgnoreCase("down")) {
			remoteControl.onButtonWasPushed(0);
			remoteControl.onButtonWasPushed(1);
			
		} else if(garagedoor.getState().toString().equalsIgnoreCase("up")) {
			remoteControl.offButtonWasPushed(0);
			remoteControl.offButtonWasPushed(1);
		}	
		
		System.out.println("");
	}

}
