package javabeans;

public class Fiesta {
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;
	
	//METODOS CONSTRUCTORES
	public Fiesta(String tipoFiesta, String fecha, String hora, String direccion, int bebidas, int bocadillos, int invitados) {
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public Fiesta() {
		super();
	}

	
	//GETTER & SETTER
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	//INVITAR
	public int invitar() {
		return invitados++;
	}
	
	//CANCELARINVITACION
	public int cancelarInvitacion(){
		return invitados--;
	}
	
	//PRECIOFIESTA
	public int precioFiesta() {
		return (invitados*5) + (bebidas*2)+ (bocadillos*3); 
	}
	
	//TOSTRING
	@Override 
	public String toString() {
		return "Fiesta [tipoFiesta=  " +tipoFiesta + ", direccion= " + direccion + " bocadillos= " + bocadillos 
				+ " bebidas= " + bebidas + " invitados= " + invitados + " fecha= " + fecha + " hora= " + hora
				+ "Total de precio de la fiesta --> " + precioFiesta() +"]";
	}
	
}
