package montaņanorusa;

public class Resolucion {

	public static void main(String[] args) {
		Carrito car1= new Carrito();
		RecorridodeMontaņa rec = new RecorridodeMontaņa("como.in",car1);
		rec.resolver(car1);
		System.out.println("X="+car1.getX() +"    "+"Y="+car1.getY());
		

	}

}
