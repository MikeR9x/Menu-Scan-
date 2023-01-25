import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Ingresa la figura que quieres hacer: circulo o cuadrado");
			int contador = 0;
			while(contador==0) {
				String figura = scan.nextLine();
			if(figura.contains("cuadrado")) {
				Cuadrado c = new Cuadrado();
				System.out.println("Ingresa la longitud del Cuadrado");
				c.cambiarLongitud(scan.nextInt());
				System.out.println("La longitud es: " + c.longitud);
				System.out.println("Ingrese la operación que desea calcular: diagonal, area o perimetro");
				figura = scan.next();
				contador++;
				if(figura.contains("diagonal")) {
					System.out.println("La diagonar el: " + c.calcularDiagonal());
				}else if(figura.contains("area")) {
					System.out.println("El area es: " + c.calcularArea());
				}else if(figura.contains("perimetro")) {
					System.out.println("El perimetro es: " + c.calcularPerimetro());
				}
				
			}else if(figura.contains("circulo")) {
				Circulo z = new Circulo();
				System.out.println("Ingresa el radio del Circulo");
				z.cambiarRadio(scan.nextInt());
				System.out.println("El radio es: " + z.radio);
				System.out.println("Que desea calcular: circunferencia o area");
				figura = scan.next();
				contador++;
				if(figura.contains("circunferencia")) {
					System.out.println("La circunferencia es: " + z.calcularCircunferencia());
				} else if (figura.contains("area")) {
					System.out.println("El area es: " + z.calcularArea());
				}
			}
			if(contador==1) {
				break;
			}
			System.out.println("Error. Escriba la figura nuevamente");
		}
		}
		
	}

}
