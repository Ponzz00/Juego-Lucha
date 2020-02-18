package Lucha;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		
		//---------INSTANCIACION DE OBJETOS--------------------------------------------------------------------
		
		Personajes Personaje[] =
			{new Personajes( "Goku",200,140,"KAME-HAME-HA "
					+ "// KAIO-ZEN // GENKIDAMA",50,30,90),
			new Personajes( "Vegetta",300,100,"CANYON GALICK "
					+ "// BIG-BANG ATTACK // FINAL FLASH",50,30,90),
			new Personajes( "Freezer",100,240,"RAYO MORTAL "
					+ "// CANYON COSMICO // SUPERNOVA",50,30,90) };
		for(int i=0;i<Personaje.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO
			 System.out.println(Personaje[i]); 
		
		//---------LLAMADA A LOS METODOS--------------------------------------------------------------------
		
		System.out.println("\nSELECCIONA UN PERSONAJE");
		
		System.out.println(
					"\n0.GOKU"
				+ "\n1.VEGETTA"
				+ "\n2.FREEZER");
		Scanner sc = new Scanner(System.in);
		int J1;
		J1=sc.nextInt();
		int x = 0;//LO CREAMOS PARA QUE ME ESCOJA JUSTO EL VALOR QUE HE METIDO EN EL SWITCH
		x=J1;//LO IGUALAMOS PAA QUE SEA IGUAL A LA POSICION DEL PERSONAJE
		switch(J1) {
		
		case 0:
			
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[0].getNombre());
			
			break;
			
		case 1:
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[1].getNombre());
			break;
			
		case 2:
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[2].getNombre());
			break;
		
		
	}
		System.out.println("\nSelecciona otro personaje");
		int J2;
		int y=0;
		J2=sc.nextInt();
		
			switch(J2) {
			
			case 0:
				
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[0].getNombre());
				
				break;
				
			case 1:
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[1].getNombre());
				break;
				
			case 2:
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[2].getNombre());
				break;
			}
			System.out.println("\n-------------¡¡¡LUCHAD!!!-----------------");
			
			
			System.out.println("\nEs el turno del Jugador 1"
					+ "\n"
					+ "\nSelecciona una habilidad:"
					+ "\n"
					+"\n[ " + Personaje[x].getT()+" ]");
			
			
			
			
	}
	}		
	
		
		
		
		
			
		
	
		
	