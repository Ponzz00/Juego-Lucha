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
	public void Dibujo0() {
		
		System.out.println("           `\\-.   `\r\n" + 
				"                      \\ `.  `\r\n" + 
				"                       \\  \\ |\r\n" + 
				"              __.._    |   \\.       S O N - G O K U\r\n" + 
				"       ..---~~     ~ . |    Y\r\n" + 
				"         ~-.          `|    |\r\n" + 
				"            `.               `~~--.\r\n" + 
				"              \\                    ~.\r\n" + 
				"               \\                     \\__. . -- -  .\r\n" + 
				"         .-~~~~~      ,    ,            ~~~~~~---...._\r\n" + 
				"      .-~___        ,'/  ,'/ ,'\\          __...---~~~\r\n" + 
				"            ~-.    /._\\_( ,(/_. 7,-.    ~~---...__\r\n" + 
				"           _...>-  P\"\"6=`_/\"6\"~   6)    ___...--~~~\r\n" + 
				"            ~~--._ \\`--') `---'   9'  _..--~~~\r\n" + 
				"                  ~\\ ~~/_  ~~~   /`-.--~~\r\n" + 
				"                    `.  ---    .'   \\_\r\n" + 
				"                      `. \" _.-'     | ~-.,-------._\r\n" + 
				"                  ..._../~~   ./       .-'    .-~~~-.\r\n" + 
				"            ,--~~~ ,'...\\` _./.----~~.'/    /'       `-\r\n" + 
				"        _.-(      |\\    `/~ _____..-' /    /      _.-~~`.\r\n" + 
				"       /   |     /. ^---~~~~       ' /    /     ,'  ~.   \\\r\n" + 
				"      (    /    (  .           _ ' /'    /    ,/      \\   )\r\n" + 
				"      (`. |     `\\   - - - - ~   /'      (   /         .  |\r\n" + 
				"       \\.\\|       \\            /'        \\  |`.           /\r\n" + 
				"       /.'\\\\      `\\         /'           ~-\\         .  /\\\r\n" + 
				"      /,   (        `\\     /'                `.___..-      \\\r\n" + 
				"     | |    \\         `\\_/'                  //      \\.     |\r\n" + 
				"     | |     |                                /' |       |     |\r\n" + 
				"");
	}

	public void Dibujo1() {
		System.out.println("                    ,\r\n" + 
				"                               ,   ,'|\r\n" + 
				"                             ,/|.-'   \\.\r\n" + 
				"                          .-'  '       |.\r\n" + 
				"                    ,  .-'              |\r\n" + 
				"                   /|,'                 |'\r\n" + 
				"                  / '                    |  ,\r\n" + 
				"                 /                       ,'/\r\n" + 
				"              .  |          _              /\r\n" + 
				"               \\`' .-.    ,' `.           |\r\n" + 
				"                \\ /   \\ /      \\          /\r\n" + 
				"                 \\|    V        |        |  ,\r\n" + 
				"                  (           ) /.--.   ''\"/\r\n" + 
				"                  \"b.`. ,' _.ee'' 6)|   ,-'\r\n" + 
				"                    \\\"= --\"\"  )   ' /.-'\r\n" + 
				"                     \\ / `---\"   .\"|'\r\n" + 
				"  V E G E T T A       \\\"..-    .'  |.\r\n" + 
				"                       `-__..-','   |\r\n" + 
				"                     __.) ' .-'/    /\\._\r\n" + 
				"               _.--'/----..--------. _.-\"\"-._\r\n" + 
				"            .-'_)   \\.   /     __..-'     _.-'--.\r\n" + 
				"           / -'/      \"\"\"\"\"\"\"\"\"         ,'-.   . `.\r\n" + 
				"          | ' /                        /    `   `. \\\r\n" + 
				"          |   |                        |         | |\r\n" + 
				"           \\ .'\\                       |     \\     |\r\n" + 
				"          / '  | ,'               . -  \\`.    |  / /\r\n" + 
				"         / /   | |                      `/\"--. -' /\\\r\n" + 
				"        | |     \\ \\                     /     \\     |\r\n" + 
				"         \\      | \\                  .-|      |    |");
	}
	
	public void Dibujo2() {
		System.out.println(" __...__\r\n" + 
				"          \"-._  \"\"--.._     \\-.\r\n" + 
				"              \"-.      \"-.   \\ `.\r\n" + 
				"                 \\        `. |   \\\r\n" + 
				"                  |   \\  \\  \\`|   \\   _.---..__\r\n" + 
				" -..\"\"\"\"\"\"\"---..  |          \\|   |,-\" __   __..\"--\r\n" + 
				"    \"\"--._      \"\"-|   | |  \\ |   `_.-\"  \"\"--._\r\n" + 
				"         _`-.       `.         _.-\"         ___.\"-\r\n" + 
				"       \"-.\"\"-`. `.    `.     -\" _-\"  ,' .-\"\"__\r\n" + 
				"           \"-. \\  \\     _.._        / ,'     _\"-\r\n" + 
				"          _.----\\           `.       /  =._   `\\\\\r\n" + 
				"        ,/ _.--   /    \\,-.   \\\"\"-.     -._  :.\\\r\n" + 
				"       /  __... / |   /\"   `. |   )          _)\\\r\n" + 
				"      /-\"\"  /  (   `.|   ./ _\\|  ',-\"\"\\  _.-\"\r\n" + 
				"           | .-/\\ /|\"6=.,.=6\"/`    ,9 |-\"     S O N - G O H A N\r\n" + 
				"           '  '\" \\|`(--')`--'      /',\\\r\n" + 
				"                  `  \\\"/_ \"\"\"    _.-'  \\       super saiya-jin\r\n" + 
				"                      . .--     /\\      \\         (9 years)\r\n" + 
				"                       `.\"   .-   |      \\\r\n" + 
				"                         \"--\"    /       |\"-.----._\r\n" + 
				"                   ,-.---,|    ,'   ______   `.    `--..__\r\n" + 
				"               .-\"/   .'' |   .--\"\"\"      \"\"-.|           `--.\r\n" + 
				"              /     /' \"-. _.'                |      _.--\"\"\"`-.\r\n" + 
				"             /    ./      /         --\"\"\"\"\",/'     ,'        \\ \\\r\n" + 
				"           /'|/   (      |             ,/'        /           \\ \\\r\n" + 
				"          /  /    `\\     |          ,/'          /            |  )\r\n" + 
				"          | /       `._.- ---..__,/'            ( \\          /   /\r\n" + 
				"           (          `.      ,/'                `.`-..__    `--._\r\n" + 
				"          / `.          `\\_,/'                     \\      \"`\\     \\ ");}   
	
	
	
	
	@Override
	public String toString() {
		return "Personajes [Nombre= " + Nombre + " // Vida= " + Vida 
				+ " // Stamina= " + Stamina + " // (DANYO) T= / " + T + "]";
	}
	
	}
