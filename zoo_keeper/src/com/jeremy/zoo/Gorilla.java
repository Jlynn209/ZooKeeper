package com.jeremy.zoo;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something and the energy level has decreased by 5");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla is happy that it ate a banana, energy has increased by 10");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("The Gorilla climbed a tree, energy has decreased by 10");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
