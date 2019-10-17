
public class Espaco {
	
	private boolean bomba;
	private int bombasAoRedor;
	private boolean pressionado;
	private int posicaoX;
	private int posicaoY;
	
	public Espaco(int posX, int posY) {
		setPosicaoX(posX);
		setPosicaoX(posY);
		setBomba(false);
		setPressionado(false);
	}
	
	public boolean isBomba() {
		return bomba;
	}
	public void setBomba(boolean bomba) {
		this.bomba = bomba;
	}
	public int getBombasAoRedor() {
		return bombasAoRedor;
	}
	public void setBombasAoRedor(int bombasAoRedor) {
		if(bombasAoRedor <= 0 && bombasAoRedor >= 8);
			this.bombasAoRedor = bombasAoRedor;
	}
	public boolean isPressionado() {
		return pressionado;
	}
	public void setPressionado(boolean pressionado) {
		this.pressionado = pressionado;
	}
	
	//posições
	public int getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	
	
	

}
