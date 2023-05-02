package Fundamentos;
import java.util.Scanner;
public class CorrecaoDesafioConversao
{
    public static void main(String[] args) {
        //inicia o scanner
        Scanner entrada = new Scanner(System.in);
        //faz o dialogo de input e substitui , por .
        System.out.print("Informe o primeiro salario");
        String valor1 = entrada.next().replace(",",".");

        System.out.print("Informe o segundo salario");
        String valor2 = entrada.next().replace(",",".");

        System.out.print("Informe o terceiro salario");
        String valor3 = entrada.next().replace(",",".");
        //faz a conversão de String para Double
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor1);
        double salario3 = Double.parseDouble(valor1);
        //finaliza o calculo para se obter a media dos salarios
        double media = (salario1+salario2+salario3) /3;
        System.out.println("A média dos salários é"+ media);
    }
}
