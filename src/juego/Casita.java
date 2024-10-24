package juego;

import java.awt.Image;
import entorno.Entorno;
import entorno.Herramientas;

public class Casita {
	
	private int x;
	private int y;
	private double escala;
        private Image casitaI;
	
	public Casita(int x, int y, double escala) {
		this.x = x;
		this.y = y;
		this.escala = escala;		
	}
	
	public Image getImageCasita() {
		this.casitaI = Herramientas.cargarImagen("imagenes/casita2.png");
		return casitaI;
	}
	
	public void dibujarCasita(Entorno entorno) {
		entorno.dibujarImagen(casitaI, this.x, this.y, 0, this.escala);
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getEscala() {
		return escala;
	}

}
