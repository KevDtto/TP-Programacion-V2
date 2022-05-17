package juego;

import java.awt.Color;

import entorno.Entorno;

public class Obstaculos2 {
	private double x;
	private double y;
	private double radio;

	public Obstaculos2(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	public void dibujar(Entorno e) {
		e.dibujarCirculo(this.x, this.y, this.radio, Color.RED);
	}

	// getters and setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


}
