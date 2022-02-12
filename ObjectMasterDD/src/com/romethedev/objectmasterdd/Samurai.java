package com.romethedev.objectmasterdd;

public class Samurai extends Human {
	
	private static int counter;	//store a counter variable so we can keep track of how many samurai we have
	
	//Samurai: Set a default health of 200
	Integer health = 200;
	
	public Samurai() {
		counter++;		//constructor to add a new samurai and increase our counter by 1
	}
	
	//Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human h) {
		h.health = 0;			//take h's health and reduce it to 0. he dead...
		health /= 2;		//decrease samurai health by half
	}
	
	//Samurai: Add a method meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		health += health / 2;	//increase health by half of current health amount
	}
	
	public static int howMany() {
		return counter;
	}
}
