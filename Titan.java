package juego;

import java.awt.Color;

import entorno.Entorno;

public class Titan {
	double x;
	double y;
	double radio;
	double angulo;
	

	public Titan(double x, double y, double radio, double angulo) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.angulo = angulo;
	}

	public void dibujar(Entorno e) {
		e.dibujarCirculo(this.x, this.y, this.radio, Color.BLUE);
	}

	public void moverTitan() {
		this.x -= Math.cos(this.angulo) * 1;
		this.y -= Math.sin(this.angulo) * 1;
	}

	public void direccionTitan(double x, double y) {
		double dx = this.x - x;
		double dy = this.y - y;
		this.angulo = Math.atan2(dy, dx);
	}
	

	public boolean colisiona(double radio1, double radio2, double dist) {
		return (radio1 + radio2) > dist;
	}
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

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

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

}
