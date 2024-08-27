
public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = short 289;
		this.dorsal = byte 7;
	}
	
	@Override
    public int compareTo(Futbolista f) {
      int a =  this.getEdad();
      int b = f.getEdad();
      if((a-b)>0) {
    	  return(a-b);
      }
      else {
    	  return(-1*(a-b));
      }
    }
	
	@Override
	public String toString(Jugador elJugador) {
		System.out.println("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + 
				",y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + 
				". Ha marcado " + this.golesMarcados);
		}
	
	@Override
	public abstract boolean jugarConLasManos() {
		return false;
	}
	
}
