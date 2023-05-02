package Fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionario
	
		//tipos numericos inteiros	
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numéricos reais 
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo boleano
		boolean estaDeFerias = false; // true
		
		//tipo caractere
		char status ='A'; //ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa *365);
		
		//numeros de viagens
		System.out.println(numeroDeVoos/2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Ferias?" + estaDeFerias);
		System.out.println("status:" + status);
		}
}
