/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemplosComandosBasicos;
import java.util.Scanner;

/**
 *
 * @author WINDOWS8
 */
public class ExemploString {
    
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Qual seu primeiro nome?");
		String primeiroNome = input.next();
		System.out.print("Qual seu último nome?");
		String ultimoNome = input.next();
		System.out.print("Qual sua idade?");
		int idade = input.nextInt();
		System.out.println("Olá " + primeiroNome + " " + ultimoNome + " de " + idade + " anos.");
	}

}
