package main;

public class Main {

	public static void main(String[] args) {
		
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
		
		remoteControl.setCommand(0, garageLightOn, garageLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		//state
		GarageDoor garagedoor = new GarageDoor();
		//garagedoor.setState(garagedoor.up);
		if(garagedoor.getState().toString().equalsIgnoreCase("down")) {
			System.out.println("down");
			remoteControl.onButtonWasPushed(0);
			
		} else if(garagedoor.getState().toString().equalsIgnoreCase("up")) {
			System.out.println("up");
			remoteControl.offButtonWasPushed(0);
		}
		
		//Command Pattern

		
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		//End Of Command Pattern
		
		//Factory Pattern
		System.out.println("A " + kitchen.getName() + " has been created." );
		
		//iteratory pattern 
		ColorRepository colorRepository = new ColorRepository();
		
		for(Iterator iterator = colorRepository.getIterator(); iterator.hasNext();) {
			String color = (String)iterator.next();
			System.out.println("Color: " + color);
		}
	}

}
