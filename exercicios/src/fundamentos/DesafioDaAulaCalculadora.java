package fundamentos;

import java.util.Scanner;

public class DesafioDaAulaCalculadora {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Informe o numero ");
         double num1 = entrada.nextDouble();
		 System.out.println("Informe o numero ");
		 double num2 = entrada.nextDouble();
		
		System.out.println(
				"Informe um dos operadores a "
				+ "ser usado:\n + - * / %");
		String op = entrada.next();
		
		//logica
		double resultado = "+".equals(op) ? num1 + num2 : 0 ;
		resultado = "-".equals(op) ? num1 - num2 : resultado ;
		resultado = "*".equals(op) ? num1 * num2 : resultado ;
		resultado = "/".equals(op) ? num1 / num2 : resultado ;
		resultado = "%".equals(op) ? num1 % num2 : resultado ;
		
		System.out.printf("%.2f %s %f = %.2f", num1, op, num2, resultado);
		
		entrada.close();

	}

}