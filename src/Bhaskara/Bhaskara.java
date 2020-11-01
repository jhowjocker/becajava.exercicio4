package Bhaskara;

import java.util.Scanner;

public class Bhaskara {
	
	public double A;
	public double B;
	public double C;
	public double Delta;
	public double RaizDelta;
	public double ValorX;
	public double ValorX2;
	
	public void ObtendoValor_A() {
		Scanner Leitor = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		A = Leitor.nextInt();
		
	}
	
	public void ObtendoValor_B() {
		Scanner Leitor = new Scanner(System.in);
		System.out.println("Informe o valor de B: ");
		B = Leitor.nextInt();

}
	public void ObtendoValor_C() {
		Scanner Leitor = new Scanner(System.in);
		System.out.println("Informe o valor de C: ");
		C = Leitor.nextInt();
	
	
}
	public void ObtendoDelta() {
		Delta = ((B * B) - 4 * A * C);
	
	
}
	public void ObtendoRaiz() {
		RaizDelta = Math.sqrt(Delta);
	
	
}
	public void CalculoX() {
		ValorX = (-B + Delta) / (2 * A);
	}
	
	public void CalculoX2() {
		ValorX2 = (-B + Delta) / (2 * A);
	}
	
}	
	
	
	
	
	
