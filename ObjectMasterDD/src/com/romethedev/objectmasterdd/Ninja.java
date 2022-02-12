package com.romethedev.objectmasterdd;

public class Ninja extends Human {
	
	private static int counter;	//store a counter variable so we can keep track of how many ninja we have
	
	//Ninja: Set default stealth to 10
	Integer stealth = 10;
	
	public Ninja() {
		counter++;		//ninja constructor to add a new ninja and increase our counter by 1
	}
	
	//Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
	public void steal(Human h) {
		h.health -= stealth;	//take h's health and decrease it by ninja's stealth attribute
		health += stealth;		//increase ninja health by stealth attribute
	}
	
	//Ninja: Add a method runAway() that decreases their health by 10
	public void runAway() {
		health -= 10;	//decrease ninja health by 10
	}
	
	public static int howMany() {
		return counter;
	}
}
