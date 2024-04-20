package model;

public abstract class SuperHeroe {
	// Create the attribute and put in protected
	protected String nombre;
	protected int edad;
	protected String[] poderes;

	// Create a constructor that initialize the name and the age of superHero.
	public SuperHeroe(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.poderes = new String[4];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Method that return the potential of the hero. Potential: age of hero * 10
	public int calculcarPotencial() {
		return edad * 10;
	}

	public void showPoderes() {
		System.out.println("Poderes de " + nombre + ":");
		for (String nombrePoder : poderes) {
			System.out.println("- " + nombrePoder);
		}
	}

	public String setPoder(String poder, int position) {
		if (position > 0 && position < poderes.length) {
			poderes[position] = poder;
			return "Poder: " + poder + "añadido en la posicion " + position;
		} else {
			return "Poder no añadido";
		}
	}

}
