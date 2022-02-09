package com.jeremy.zoo;

public class Mammal {
	private int energyLevel;
	
	public int displayenergy() {
		return getEnergyLevel();
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
