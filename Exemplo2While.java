
package ExemplosEstruturado;
import java.util.Scanner;

public class Exemplo2While {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alvo;
        double juros;
        double contribuição;
        int anos = 0;
        double saldo = 0;

        // exercicio: verifique valores informados abaixo são aceitáveis
        System.out.print("Quanto dinheiro voce quer para se aposentar? ");
        alvo = sc.nextDouble();
        System.out.print("Quanto dinheiro voce vai contribuir todo ano?");
        contribuição = sc.nextDouble();
        System.out.print("Taxa de juros em % (exemplo: digite 7.5 para 7.5%): ");
        juros = sc.nextDouble();

        while (saldo < alvo) {
            saldo = (saldo + contribuição) * (1 + juros);
            anos++;
        }

        System.out.println("Voce pode se aposentar em " + anos + " anos.");
    }
}
