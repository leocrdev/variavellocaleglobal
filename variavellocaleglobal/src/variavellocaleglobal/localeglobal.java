package variavellocaleglobal;

public class localeglobal {

	/*Variável Global é acessivel a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um metodo auto executável em Java*/
	public static void main(String[] args) {
		
	
		/*Variável local porque pertence somente a este método*/
		int maiorIdade = 18;
		
		   metodo2();
	}
	
	
	public static void metodo2 () {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}
}
