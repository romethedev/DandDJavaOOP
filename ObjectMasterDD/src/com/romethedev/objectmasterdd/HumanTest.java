package com.romethedev.objectmasterdd;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		Human human2 = new Human();
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		
		human1.attack(human2);
		System.out.println(human2.health);
		
		samurai1.meditate();
		System.out.println(samurai1.health);
		
		System.out.println(Samurai.howMany());
	}

}
