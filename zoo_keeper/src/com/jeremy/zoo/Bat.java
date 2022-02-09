package com.jeremy.zoo;

public class Bat extends Mammal {

	public Bat() {
		this.setEnergyLevel(this.getEnergyLevel() + 300);
	}
	
	public void fly() {
		System.out.println("'flap~flap~flap', energy has decreased by 50.");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("the so-well, never mind, energy has increased by 25");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("'crackling~sputtering~snapping', energy has decreased by 100");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	
}
