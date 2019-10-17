
public class Testes {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro(5,5,10);

		for (int i = 0; i < 25; i++) {
			System.out.println(tab.retornaEspaco(i).isBomba());
		}

		
	}

}
