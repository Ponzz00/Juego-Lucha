package Lucha;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		
		//---------INSTANCIACION DE OBJETOS--------------------------------------------------------------------
		
		Personajes Personaje[] =
			{new Personajes( "Goku",200,140,"KAME-HAME-HA=[50] "
					+ "// KAIO-ZEN=[30] // GENKIDAMA=[90]",50,30,150),
			new Personajes( "Vegetta",300,100,"BIG-BANG ATTACK=[50] "
					+ "// CANYON GALICK=[30] // FINAL FLASH=[90]",80,50,90),
			new Personajes( "Gohan",160,180,"RAYO MORTAL=[50] "
					+ "// CANYON COSMICO=[30] // SUPERNOVA=[90]",50,30,110) };
		for(int i=0;i<Personaje.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO
			 System.out.println(Personaje[i]); 
		
		//---------LLAMADA A LOS METODOS--------------------------------------------------------------------
		
		System.out.println("\nSELECCIONA UN PERSONAJE");
		
		System.out.println(
					"\n0.GOKU"
				+ "\n1.VEGETTA"
				+ "\n2.GOHAN");
		Scanner sc = new Scanner(System.in);
		int J1;
		int x = 0;//LO CREAMOS PARA QUE ME ESCOJA JUSTO EL VALOR QUE HE METIDO EN EL SWITCH
		J1=x;	//LO IGUALAMOS PAA QUE SEA IGUAL A LA POSICION DEL PERSONAJE + 1 PARA QUE EMPIECE UNO MAS QUE EL ARRAY
		J1=sc.nextInt();
		switch(J1) {
		
		case 0:
			
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[0].getNombre());
			Personaje[0].Dibujo0();
			break;
			
		case 1:
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[1].getNombre());
			Personaje[0].Dibujo1();
			break;
			
		case 2:
			System.out.println("Jugador 1 ha seleccionado a "+Personaje[2].getNombre());
			Personaje[0].Dibujo2();
			break;
		
		
	}
		System.out.println("\nSelecciona otro personaje");
		int J2;
		int y=0;
		J2=y;
		J2=sc.nextInt();
		
			switch(J2) {
			
			case 0:
				
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[0].getNombre());
				Personaje[0].Dibujo0();
				break;
				
			case 1:
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[1].getNombre());
				Personaje[0].Dibujo1();
				break;
				
			case 2:
				System.out.println("Jugador 2 ha seleccionado a "+Personaje[2].getNombre());
				Personaje[0].Dibujo2();
				break;
			}
			
			System.out.println("\n-------------¡¡¡LUCHAD!!!-----------------");
			
			while(Personaje[J1].getVida()>0||Personaje[J2].getVida()>0) { //CREE ESTE BUCLE PARA QUE SE FUESE REPITIENDO
																	 //SECUENCIALMENTE HASTA QUE UNO MURIESE, PERO AL REINICIAR EL BUCLE, 
																	//TAMBIEN REINICIA LA VIDA ASI QUE LO HARE DE LA MANERA LARGA.
			System.out.println("\nEs el turno del Jugador 1"
					+ "\n"
					+ "\nSelecciona una habilidad: [0 / 1 / 2]"
					+ "\n"
					+"\n[ " + Personaje[J1].getT()+" ]");
			System.out.println("\n-----------------------------------------\n");

			int stec=x;
			stec=sc.nextInt();
			int resultado;
			int restaStamina;
			switch(stec) {
			
			case 0:
				
				System.out.println("Jugador 1 ha hecho "+Personaje[stec].getT1()+" de Daño");
				resultado=Personaje[J2].getVida()-Personaje[J1].getT1();
				System.out.println("Vida del Jugador 2 disminuye a: " + resultado+" de Vida");
				restaStamina=Personaje[J1].getStamina()-20;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				break;
				
			case 1:
				System.out.println("Jugador 1 ha hecho "+Personaje[stec].getT2()+" de Daño");
				resultado=Personaje[J2].getVida()-Personaje[J1].getT2();
				System.out.println("Vida del Jugador 2 disminuye a: " + resultado+" de Vida");
				restaStamina=Personaje[J1].getStamina()-35;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				break;
			case 2:
				System.out.println("Jugador 1 ha hecho "+Personaje[stec].getT3()+" de Daño");
				resultado=Personaje[J2].getVida()-Personaje[J1].getT3();
				System.out.println("Vida del Jugador 2 disminuye a: " + resultado+" de Vida");
				restaStamina=Personaje[J1].getStamina()-50;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				break;
			
			
			}
			System.out.println("\n-----------------------------------------\n");
			System.out.println("\nEs el turno del Jugador 2"
					+ "\n"
					+ "\nSelecciona una habilidad: [0 / 1 / 2]"
					+ "\n"
					+"\n[ " + Personaje[J2].getT()+" ]");
			System.out.println("\n-----------------------------------------\n");	
			
			int stec1=y;
			stec1=sc.nextInt();
			int resultado1;
			
			switch(stec1) {
			
			case 0:
				
				System.out.println("Jugador 2 ha hecho "+Personaje[stec1].getT1()+" de Daño");
				resultado1=Personaje[J1].getVida()-Personaje[J2].getT1();
				System.out.println("Vida del Jugador 1 disminuye a: " + resultado1+" de Vida");
				restaStamina=Personaje[J2].getStamina()-20;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				break;
			case 1:
				
				System.out.println("Jugador 2 ha hecho "+Personaje[stec1].getT2()+" de Daño");
				resultado1=Personaje[J1].getVida()-Personaje[J2].getT2();
				System.out.println("Vida del Jugador 1 disminuye a: " + resultado1+" de Vida");
				restaStamina=Personaje[J2].getStamina()-35;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				
				break;
			case 2:
				
				System.out.println("Jugador 2 ha hecho "+Personaje[stec1].getT3()+" de Daño");
				resultado1=Personaje[J1].getVida()-Personaje[J2].getT3();
				System.out.println("Vida del Jugador 1 disminuye a: " + resultado1+" de Vida");
				restaStamina=Personaje[J2].getStamina()-50;
				System.out.println("Stamina del Jugador 1 ha bajado a: "+restaStamina);
				
				break;}
		
	}
		
				System.out.println("EL GANADOR ES...: ");
		}
}
			
		


























