/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemplosComandosBasicos;

/**
 *
 * @author WINDOWS8
 */
public class ExemploCasting {
    public static void main(String[] args) {
	
	int x = 10;
	int y = 6;
	int z = 3;
	double a = 3;
	double b = 1.0;
	double c = (double)x / y;
	
	int h = (int)c;
	System.out.println("x = " + h);
	System.out.println("y = " + y);
	System.out.println("z = " + z);
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	
} 

    
}
