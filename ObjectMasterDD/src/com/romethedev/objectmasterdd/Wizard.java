package com.romethedev.objectmasterdd;

public class Wizard extends Human {
	
	private static int counter;	//store a counter variable so we can keep track of how many wizards we have
	
	//Wizard: Set default health to 50
	Integer health = 50;
	
	//Wizard: Set default intelligence to 8
	Integer intelligence = 8;
	
	public Wizard() {
		counter++;		//wizard constructor to add a new wizard and increase our counter by 1
	}
	
	//Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human h) {	//take in a human object and set variable to h
		h.health += intelligence;		//take h's health and increase it by wizards intelligence
	}
	
	//Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human h) {	//take in a human object and set variable to h
		h.health -= intelligence * 3;		//take h's health and decrease it by wizards intelligence * 3
	}
	
	public static int howMany() {
		return counter;
	}
}
