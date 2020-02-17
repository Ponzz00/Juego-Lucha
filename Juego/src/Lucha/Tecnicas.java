package Lucha;

public class Tecnicas {
	
	String T1="50";
	String T2="30";
	String T3="90";
	
	public Tecnicas(String t1,String t2,String t3) {
	T1 = t1;
	T2 = t2;
	T3 = t3;
	
	int Danyo_1=Integer.parseInt(t1);
	int Danyo_2=Integer.parseInt(t2);
	int Danyo_3=Integer.parseInt(t3);
	
	}
	
	public void ListaTecnicas() {
	Tecnicas tecnicas[] = {new Tecnicas( "KAME-HAME-HA","KAIO-ZEN","GENKIDAMA"),
			new Tecnicas( "CANYON GALICK","BIG-BANG ATTACK ","FINAL FLASH"),
			new Tecnicas( "RAYO MORTAL","CANYON COSMICO","SUPERNOVA") };
	for(int i=0;i<tecnicas.length;i++)//USAMOS (FOR) PARA MOSTRAR LA LISTA UNO POR UNO
		 System.out.println(tecnicas[i]); 
	}

}
