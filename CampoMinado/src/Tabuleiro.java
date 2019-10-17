public class Tabuleiro {
	
	private Espaco[] espacos;
	private int tamanhoX;
	private int tamanhoY;
	private int qBombas;
	
	public Tabuleiro(int tamanhoX, int tamanhoY, int qBombas) {
		setTamanhoX(tamanhoX);
		setTamanhoY(tamanhoY);
		setqBombas(qBombas);
		gerarEspacos();
		colocarBombas();
	}
	
	public Espaco[] getEspacos() {
		return espacos;
	}
	public void setEspacos(Espaco[] espacos) {
		this.espacos = espacos;
	}
	public int getTamanhoX() {
		return tamanhoX;
	}
	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}
	public int getTamanhoY() {
		return tamanhoY;
	}
	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}
	public int getqBombas() {
		return qBombas;
	}
	public void setqBombas(int qBombas) {
		if(qBombas < (getTamanhoX()*getTamanhoY()))
			this.qBombas = qBombas;
	}
	
	
	//metodos

	
	public void colocarBombas() {
		int contador = getqBombas();
		
		while(contador > 0){
			int num = (int)(espacos.length * Math.random());
			
			if(!espacos[num].isBomba()) {
				espacos[num].setBomba(true);
				contador--;
			}
		}
		
	}
	
	public void gerarEspacos() {
		espacos = new Espaco[getTamanhoX() * getTamanhoY()];
		int cont = 0;
		for (int i = 0; i < getTamanhoX(); i++) {
			for (int j = 0; j < getTamanhoY(); j++) {
				Espaco esp = new Espaco(i,j);
				espacos[cont] = esp;
				cont++;
			}
			
		}
	}
	
	public Espaco retornaEspaco(int num) {
		return espacos[num];
	}
	

}
