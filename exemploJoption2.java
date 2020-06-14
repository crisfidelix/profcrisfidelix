
package ExemploJoption;
import javax.swing.JOptionPane;    

public class Exemplo2 {
    public static void main(String[] args) {
    //APRESENTAÇÃO DAS VARIAVEIS  
   String a, b;   
   float c, d, e;  
   
   a = JOptionPane.showInputDialog ("Digite o primeiro numero");  
   c = Float.parseFloat(a);  
   b = JOptionPane.showInputDialog ("Digite o segundo numero");  
   d = Float.parseFloat(b);  
   e = c + d;  
    JOptionPane.showMessageDialog(null, "Resultado da soma: " + e, "Feito", JOptionPane.PLAIN_MESSAGE );  
  
  
  }  

    
}
