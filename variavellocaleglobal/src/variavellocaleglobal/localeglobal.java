package variavellocaleglobal;

public class localeglobal {

	/*Vari�vel Global � acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*Main � um metodo auto execut�vel em Java*/
	public static void main(String[] args) {
		
	
		/*Vari�vel local porque pertence somente a este m�todo*/
		int maiorIdade = 18;
		
		   metodo2();
	}
	
	
	public static void metodo2 () {
		System.out.println("Valor da vari�vel Global = " + maiorIdadeGlobal);
	}
}
