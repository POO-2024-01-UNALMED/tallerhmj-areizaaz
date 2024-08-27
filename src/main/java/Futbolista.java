package test;

public abstract class Futbolista implements Comparable<Futbolista>{
	protected String nombre;
	protected int edad;
	protected final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion){
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this(Maradona, delantero, 30);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getPosicion() {
		return this.posicion;
	}
	
	public int compareTo();
	
	@Override
	public String toString(Futbolista elFutbolista) {
		System.out.println("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				",y juega de " + this.getPosicion() + ".");
	}
	
	@Override
	public boolean equals(Futbolista f) {
		
		if(this == f) {
			return true;
		}
		
		else {
			return false;
		}	
	}
	
	public abstract boolean jugarConLasManos();
	}
	
}
