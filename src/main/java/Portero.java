
public class Portero {
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, String posicion = "Portero",short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString(Jugador elJugador) {
		System.out.println("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				",y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + 
				". Le han marcado " + this.golesRecibidos);
		}
	
	@Override
    public int compareTo(Portero f) {
      int a =  this.golesRecibidos();
      int b = f.golesRecibidos();
      if((a-b)>0) {
    	  return(a-b);
      }
	
      @Override
      public abstract boolean jugarConLasManos() {
  		return true;
  	}
      
}
