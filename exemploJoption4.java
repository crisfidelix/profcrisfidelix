
package ExemploJoption;

import javax.swing.JOptionPane;
public class Exemplo4 {
        public static void main( String args[] )  
{
        String nomep ;
        String valorp;
        double desc = 0.25;
        double valor,result;
        nomep = JOptionPane.showInputDialog(null,"escreva o nome do produto ");
        valorp = JOptionPane.showInputDialog(null,"digite o valor ");
        valor =Double.parseDouble(valorp);
        result = desc * valor;
        System.out.println("o valor do desconto do " + nomep + " è = " + result);
    
}
}
