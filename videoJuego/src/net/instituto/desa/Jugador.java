package net.instituto.desa;

public class Jugador {
	int y, x;

	public void derecha(int i) {
		this.x=this.x+i;
	}

	public void izquierda(int i) {
		this.x=this.x-i;
	}

	public void arriba(int i) {
		this.y=this.y+i;
	}

	public void abajo(int i) {
		this.y=this.y-i;
	}

}
