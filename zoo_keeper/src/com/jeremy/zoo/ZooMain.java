package com.jeremy.zoo;

public class ZooMain {

	public static void main(String[] args) {
		
		Gorilla bob = new Gorilla();
		
		bob.throwSomething();
		bob.throwSomething();
		bob.throwSomething();
		bob.eatBananas();
		bob.eatBananas();
		bob.climb();
		System.out.println(bob.getEnergyLevel()); 
	}

}
