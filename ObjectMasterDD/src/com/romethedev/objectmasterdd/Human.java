package com.romethedev.objectmasterdd;

public class Human {
	//Add the strength, stealth, and intelligence attributes with a default of 3
	Integer strength = 3;
	Integer stealth = 3;
	Integer intelligence = 3;
	
	//Add the health attribute with a default of 100
	Integer health = 100;
	
	//Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
	public void attack(Human h) {	//take in a human object and set variable to h
		h.health -= strength;		//take h's health and decrease it by strength
	}
}
