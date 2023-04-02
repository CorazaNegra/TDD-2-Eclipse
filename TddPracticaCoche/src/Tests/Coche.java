package Tests;

public class Coche {

	public int velocidad_Francisco_Salar;

	public void acelerar_Francisco_Salar(int aceleracion) {
		
		velocidad_Francisco_Salar += aceleracion;
		
	}

	public void decelerar_Francisco_Salar(int deceleracion) {
		
		velocidad_Francisco_Salar -= deceleracion;
		if (velocidad_Francisco_Salar < 0) velocidad_Francisco_Salar = 0;
		
	}

}
