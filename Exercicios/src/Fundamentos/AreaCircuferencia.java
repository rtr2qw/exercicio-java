package Fundamentos;

public class AreaCircuferencia { 
	public static void main(String[] args) {
		//declaração de variavel real;
		double raio = 3.4;
		//declaraçao de constante;
		final double PI = 3.14159;
		
		//operação para o calculo da Area;
		double area= PI* raio * raio;
		 //imprime o valor de area;
		System.out.println(area);
		 
		 raio = 10;
		 area = PI * raio * raio;
		 //concatena a string entre aspas com a variavel area;
		 System.out.println("Area = " + area);
		
		
		
	}

}
