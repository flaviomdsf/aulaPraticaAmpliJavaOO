/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;
import java.util.Locale;
import java.util.Scanner;
import pessoas.Clientes;
import principal.aplicarBanco;
/**
 *
 * @author flavi
 */
public class Banco {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        Clientes cliente1 = new Clientes();
        cliente1.nome = "Flavio Mendes";
        cliente1.cpf = "111.111.111-11";
        cliente1.conta = "12345-6";
        cliente1.saldo = 1000.00;
        
        int opcao = 0;
        while (opcao != 5){
            System.out.println("""
                               OPERAÇÕES:

                               1 - Consultar Saldo
                               2 - Depositar
                               3 - Saque
                               4 - Quero Investir
                               5 - Sair

                               Escolha uma das opções:
                               """);
            opcao = sc.nextInt();
        
        
            switch(opcao){
                case 1:
                    System.out.println("Seu Saldo é: " + cliente1.saldo);
                    break;
                case 2:
                    System.out.println("Digite quanto deseja depositar: ");
                    double deposito = 0;
                    deposito = sc.nextDouble();
                    System.out.println("O valor depositado foi: " + deposito );
                    cliente1.saldo = cliente1.saldo + deposito;
                    System.out.println("Seu saldo atual é: " + cliente1.saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    double saque = 0;
                    saque = sc.nextDouble();
                    System.out.println("Tudo bem, o valor: " + saque + " foi retirado da sua conta");
                    cliente1.saldo = cliente1.saldo - saque;
                    System.out.println("Seu saldo atual é: " + cliente1.saldo);
                    break;
                case 4:
                    aplicarBanco investidor = new aplicarBanco();
                    investidor.Aplicar();
                    break;
                case 5:
                    System.out.println("Obrigado pela visita!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma das opções apresentadas");
                    break;
            }
        }
        
    }
    
}
