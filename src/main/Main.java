
package main;

import model.*;

public class Main {

	public static void main(String[] args) {
		// Create a superHero type hulk
		Hulk heroe = new Hulk();

		// Put in true the attribute of furia
		heroe.transformar();
		System.out.println("\n" + "Nombre: " + heroe.getNombre());
		System.out.println("Edad: " + heroe.getEdad() + "\n");
		// Show the list of power
		heroe.showPoderes();
		// Show if the superHero is in furia
		System.out.println("Furia: " + heroe.isFuria());
		// Calculate the potential of hulk
		System.out.println("Calcular Potencial: " + heroe.calculcarPotencial() + "\n");
		// Put in false the attribute of furia
		heroe.restaurar();
	}

}
