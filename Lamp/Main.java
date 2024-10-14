class Main{
	public static void main(String [] args){
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		Lamp Incandescent = new Lamp();
		Lamp Flourescent = new Lamp();
		led.name = "Seven";
		halogen.name = "Pedro";
		Flourescent.name = "Seven";
		Incandescent.name = "Pedro";
		
		led.isOn = true;
		Flourescent.isOn();
		Flourescent.turnOn();
		led.turnOn();
		halogen.isOn();
		Incandescent.isOn();
		Incandescent.isOff();
		halogen.turnOff();
	}
}