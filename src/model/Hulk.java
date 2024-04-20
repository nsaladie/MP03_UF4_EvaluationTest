package model;

import main.Mutable;

public class Hulk extends SuperHeroe implements Mutable {

	private boolean furia;

	public Hulk() {
		// Pass the name and the age to the class father
		super("Hulk", 25);
		// Initialize the attribute
		this.furia = false;
		// Declared the powers of hulk
		this.poderes = new String[] { "fuerte", "alto", "resistente", "irascible" };
	}

	public boolean isFuria() {
		return furia;
	}

	@Override
	public int calculcarPotencial() {
		// Save the result of the method calcularPotencial of the father in the variable potencial
		int potencial = super.calculcarPotencial();

		if (furia) {
			// If furia is true, multiply the result by 2.
			return potencial *= 2;
		} else {
			return potencial;
		}
	}

	public void transformar() {
		System.out.println("¡Hulk ha entrado en furia!");
		this.furia = true;
	}

	public void restaurar() {
		System.out.println("¡Hulk ha vuelto a la normalidad!");
		this.furia = false;
	}

}
