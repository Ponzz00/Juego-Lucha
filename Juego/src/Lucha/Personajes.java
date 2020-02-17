package Lucha;

public class Personajes {
	
	private String Nombre;
	private int Vida;
	private int Stamina;
	public String T1="50";
	public String T2="30";
	public String T3="90";
	
	
	public Personajes(String nombre,int vida, int stamina,
			String t1,String t2,String t3) {
		Nombre= nombre;
		Vida = vida;
		Stamina = stamina;
		T1=t1;
		T2=t2;
		T3=t3;
	
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getVida() {
		return Vida;
	}
	public void setVida(int vida) {
		Vida = vida;
	}
	public int getStamina() {
		return Stamina;
	}
	public void setStamina(int stamina) {
		Stamina = stamina;
	}

	public String getT1() {
		return T1;
	}

	public void setT1(String t1) {
		T1 = t1;
	}

	public String getT2() {
		return T2;
	}

	public void setT2(String t2) {
		T2 = t2;
	}

	public String getT3() {
		return T3;
	}

	public void setT3(String t3) {
		T3 = t3;
	}

	public void ListaPersonajes() {
		
		Personajes Personaje[] = {new Personajes( "Goku",200,140,"KAME-HAME-HA","KAIO-ZEN","GENKIDAMA"),
				new Personajes( "Vegetta",300,100,"CANYON GALICK","BIG-BANG ATTACK ","FINAL FLASH"),
				new Personajes( "Freezer",100,240,"RAYO MORTAL","CANYON COSMICO","SUPERNOVA") };
		for(int i=0;i<Personaje.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO
			 System.out.println(Personaje[i]); 
		}



	@Override
	public String toString() {
		return "Personajes [Nombre= " + Nombre + " // Vida= " + Vida 
				+ " // Stamina= " + Stamina + " // T1= " + T1 + " // T2= " + T2
				+ " // T3= " + T3 + "]";
	}
	
	}

