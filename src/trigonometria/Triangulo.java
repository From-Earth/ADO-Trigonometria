package trigonometria;

public class Triangulo extends Trigonometria {
	public double area(Triangulo forma) {
		double calculo;
		
		
		calculo = (this.getBase()*this.getAltura())/2;
		
		return calculo;
		
		
	}
}
