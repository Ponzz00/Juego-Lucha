package Lucha;

public class Personajes {
	
	private String Nombre;
	private int Vida;
	private int Stamina;
	private String Tecnicas;
	
	public Personajes(String nombre,int vida, int stamina, String tecnicas) {
		Nombre= nombre;
		Vida = vida;
		Stamina = stamina;
		Tecnicas = tecnicas;
		
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

	public String getTecnicas() {
		return Tecnicas;
	}

	public void setTecnicas(String tecnicas) {
		Tecnicas = tecnicas;
	}
	
	public void ListaPersonajes() {
		
		Personajes Personaje[] = {new Personajes( "Goku",200,140,""),new Personajes( "Vegetta",300,100,""),
				new Personajes( "Freezer",100,240,"") };
		for(int i=0;i<Personaje.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO
			 System.out.println(Personaje[i]); 
		}

	@Override
	public String toString() {
		return "Personajes==>"+ " Nombre= " +getNombre() + " // Vida= "+getVida() + " // Stamina= "
					+ getStamina()+ " // Tecnicas= "+ getTecnicas();
		}
	}

