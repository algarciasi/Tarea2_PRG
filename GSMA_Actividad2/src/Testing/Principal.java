package Testing;

import javabeans.Fiesta;

public class Principal {

	public static void main(String[] args) {
		Fiesta fiesta = new Fiesta();
		fiesta.setTipoFiesta("disfraces");
		fiesta.setDireccion("Avenida de los Naranjos");
		fiesta.setBocadillos(100);
		fiesta.setBebidas(500);
		fiesta.setInvitados(100);
		fiesta.setFecha("01/01/2024");
		fiesta.setHora("00:00");
		
		System.out.println("Fiesta con parámetros por defecto : " + fiesta.getTipoFiesta() + " " + fiesta.getDireccion()
		+ " " + fiesta.getBocadillos() +" "  + fiesta.getBebidas() +" " + fiesta.getInvitados() + " " 
				+ fiesta.getFecha() +" " + fiesta.getHora());

		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		
		fiesta.invitar();
		fiesta.invitar();
		
		System.out.println("Fiesta añadiendo 2 invitados : " + fiesta.getTipoFiesta() + " " + fiesta.getDireccion()
		+ " " + fiesta.getBocadillos() +" "  + fiesta.getBebidas() +" " + fiesta.getInvitados() + " " 
				+ fiesta.getFecha() +" " + fiesta.getHora());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		
		fiesta.cancelarInvitacion();
		
		System.out.println("Fiesta quitando 1 invitado (despues de haber añadido 2: " + fiesta.getTipoFiesta() + " " + fiesta.getDireccion()
		+ " " + fiesta.getBocadillos() +" "  + fiesta.getBebidas() +" " + fiesta.getInvitados() + " " 
				+ fiesta.getFecha() +" " + fiesta.getHora());
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Precio Fiesta con 101 invitados, 100 bocadillos y 500 bebidas  --> " +fiesta.precioFiesta() + "€");
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Detalle de la fiesta con toString: " + fiesta.toString());
		
	}
	
	

}
