
package ExemploJoption;

import javax.swing.JOptionPane;


public class Exemplo1 {
    
public static void main(String [] args) {
    
    
 // Exemplo 1
String resultado1;
resultado1 = JOptionPane.showInputDialog ("Digite seu nome:");
JOptionPane.showMessageDialog (null, "Para continuar clique no botão \"OK\"!");


int resultado2;
resultado2= JOptionPane.showConfirmDialog(null,"confirme !!");




//Exibe caixa de dialogo (veja figura) solicitando confirmação ou não. 
//Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
String message = "Deseja realmente enviar o e-mail do arquivo?";
String title = "Confirmação";

int opcao = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
  if (opcao == JOptionPane.YES_OPTION)
  {
    System.out.println("Confirmou ehhhh!! )");
  }
  
  
  
  
  
  
  
  // Exemplo 2
  
  
  // Algo que deseja mostrar (aviso, mensagem de erro)
    String erro = "Erro 404: não foi possível encontrar o batman";

   // Cria o JOptionPane por showMessageDialog
    //mensagem
    JOptionPane.showMessageDialog(null,"Houve um problema ao procurar o batman:\n\n '" + erro + "'.",
     // titulo da janela 
                        "Erro 404",
                        JOptionPane.INFORMATION_MESSAGE);
    


//Exemplo3:Exibir caixa de diálogo mensagem de pergunta com JOptionPane.QUESTION_MESSAGE
    JOptionPane.showMessageDialog (null, "Tem certeza que deseja sair?", "Pergunta",
         JOptionPane.QUESTION_MESSAGE);
    
 // Exemplo4:Exibir caixa de diálogo mensagem de aviso com JOptionPane.WARNING_MESSAGE
    
    JOptionPane.showMessageDialog (null, "A chamada obsoleta", "Warning",
         JOptionPane.WARNING_MESSAGE);
    
 // Exemplo5:Exibir informações de diálogo mensagem com JOptionPane.INFORMATION_MESSAGE
    
    JOptionPane.showMessageDialog (null, "Download concluído", "Pergunta",
         JOptionPane.INFORMATION_MESSAGE);
System.exit(0); 
    
}}
