
package ExemplosEstruturado;
import java.util.Scanner;

public class ExemploIf {
    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Qual o seu nome?");
	String nome = input.nextLine();
	System.out.println("Qual a sua idade?");
	int idade = input.nextInt();
	
	if(idade < 18){
		System.out.println("Você é menor de idade");
	}else{
		System.out.println("Você é maior de idade");
		
	    }
	}

    
}
