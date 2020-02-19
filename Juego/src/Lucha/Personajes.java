package Lucha;

public class Personajes {
	
	private String Nombre;
	private int Vida;
	private int Stamina;
	private String T;
	private int t1;
	private int t2;
	private int t3;
	

	public Personajes(String nombre, int vida, int stamina,
			String t, int t1, int t2, int t3) {
		Nombre = nombre;
		Vida = vida;
		Stamina = stamina;
		T = t;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
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

	public String getT() {
		return T;
	}

	public void setT(String t) {
		T = t;
	}

	public int getT1() {
		t1=50;
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	public int getT2() {
		t2=30;
		return t2;
	}

	public void setT2(int t2) {
		this.t2 = t2;
	}

	public int getT3() {
		t3=90;
		return t3;
	}

	public void setT3(int t3) {
		this.t3 = t3;
	}

	@Override
	public String toString() {
		return "Personajes [Nombre= " + Nombre + " // Vida= " + Vida 
				+ " // Stamina= " + Stamina + " // (DANYO) T= / " + T + "]";
	}
	
	}
