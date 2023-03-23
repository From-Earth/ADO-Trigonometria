package trigonometria;
public class Main {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		retangulo.setBase(40);
		retangulo.setAltura(10);
		
		System.out.println("calculo area Retangulo: "+  retangulo.area(retangulo));
		
		triangulo.setBase(40);
		triangulo.setAltura(10);
		
		System.out.println("calculo area Triangulo: "+  triangulo.area(triangulo));
		
				
		
		

	}

}
