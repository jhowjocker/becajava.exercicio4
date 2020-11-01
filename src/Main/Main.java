package Main;

import Bhaskara.Bhaskara;

public class Main {

	public static void main(String[] args) {
			Bhaskara bhaskara = new Bhaskara();
			
			do {
					bhaskara.ObtendoValor_A();
					
					if(bhaskara.A <= 0) {
						System.out.println("Erro: Insira um valor maior que 0");
					}
			}while (bhaskara.A <= 0);
				
			bhaskara.ObtendoValor_B();
			bhaskara.ObtendoValor_C();
			bhaskara.ObtendoDelta();
			bhaskara.ObtendoRaiz();
			bhaskara.CalculoX();
			bhaskara.CalculoX2();
			
			System.out.println("Valor da raiz de delta é: " + bhaskara.RaizDelta);
			System.out.println("Valor da equação x1: " + bhaskara.ValorX);
			System.out.println("Valor da equação x2: " + bhaskara.ValorX2);
				
				
				
				
		}
}
