import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Ingresa la figura que quieres hacer: circulo o cuadrado");
			String figura = scan.nextLine();
			if(figura.contains("cuadrado")) {
				Cuadrado c = new Cuadrado();
				System.out.println("Ingresa la longitud del Cuadrado");
				c.cambiarLongitud(scan.nextInt());
				System.out.println("La longitud es: " + c.longitud);
				System.out.println("Ingrese la operación que desea calcular: diagonal, area o perimetro");
				figura = scan.next();
				if(figura.contains("diagonal")) {
					System.out.println(c.calcularDiagonal());
				}else if(figura.contains("area")) {
					System.out.println(c.calcularArea());
				}else if(figura.contains("perimetro")) {
					System.out.println(c.calcularPerimetro());
				}
				
			}else if(figura.contains("circulo")) {
				Circulo z = new Circulo();
				System.out.println("Ingresa el radio del Circulo");
				z.cambiarRadio(scan.nextInt());
				System.out.println("El radio es: " + z.radio);
				System.out.println("Que desea calcular: circunferencia o area");
				figura = scan.next();
				if(figura.contains("circunferencia")) {
					System.out.println("La circunferencia es: " + z.calcularCircunferencia());
				} else if (figura.contains("area")) {
					System.out.println(z.calcularArea());
				}
			}
			
		}
		
	}

}
