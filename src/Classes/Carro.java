package Classes;

public class Carro {
	
	int velocidadActual = 0;
	
	public Carro() {
		
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	public boolean arrancar() {
		boolean ligado = true;
		if (velocidadActual >= 0) {
			ligado = true;
		} else {
			ligado = false;
		}
		return ligado;
	}

	public int acelerar() {
		if(arrancar()) {
			if(velocidadActual < 300) {
				velocidadActual += 1;
			}
		}
		return velocidadActual;
	}
	
	public int frenar() {
		
		if(velocidadActual >= 1) {
			velocidadActual -= 1;
		}
		return velocidadActual;
	}
	
}
