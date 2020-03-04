package main;

public class Main {

	public static void main(String[] args) {
		//factory
		RoomFactory factory = new RoomFactory();
		Home home = new Home(factory);
		Room kitchen = home.createRoom("Kitchen", 2);
		Room garage = home.createRoom("Garage", 4);

		System.out.println(kitchen.getName());
		
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
		//garagedoor.setState(garagedoor.up);
		System.out.println(garagedoor.getState());
		
		if(garagedoor.state.toString().equalsIgnoreCase("Garage Door is down and landscape lights are off")) {
			System.out.println("true");
		}
		
		//Command Pattern
		remoteControl.setCommand(0, garageLightOn, garageLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
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
