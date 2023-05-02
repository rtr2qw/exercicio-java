package Fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;

public class DesafioConversao {
    public static void main(String[] args) {
        String salario = JOptionPane.showInputDialog("Digite o seu salário 1: ");
        String salario2 = JOptionPane.showInputDialog("Digite o seu salário 2: ");
        String salario3 = JOptionPane.showInputDialog("Digite o seu salário 3: ");

        double valor1 = Double.parseDouble(salario);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double resultado = valor1+valor2+valor3/3;


        DecimalFormat fmt = new DecimalFormat("R$#,###0.00");
       fmt.format(1234.36);

        JOptionPane.showMessageDialog(null,
                "Sua média é:  " + fmt.format(resultado));

    }
}
