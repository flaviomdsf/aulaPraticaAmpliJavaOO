/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author flavi
 */
public class aplicarBanco {
    public void Aplicar(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float valorInvest = 0;
        float tempoInvest = 0;
        float rendimentoInvest = 0;
        int investimento = 0;
        
        System.out.println("Olá! Sejam bem-vindo a área do investidor");
        System.out.println("""
        Em que você gostaria de investir hoje?
            1 - CDB
            2 - LCI
        """);
        investimento = sc.nextInt();
        switch (investimento) {
            case 1:
                System.out.println("""
                    Rent. Bruta a.m.: 0,80%
                    Rent. Bruta a.a.: 10,00%
                """);
                System.out.println("Informe o valor que será investido:");
                valorInvest = sc.nextFloat();
                System.out.println("Por quantos meses o valor permanecerá no investimento?");
                tempoInvest = sc.nextInt();
                if (tempoInvest >= 12 ){
                    float ano = (float) (valorInvest * 0.10);
                    rendimentoInvest = ano;
                    System.out.println(rendimentoInvest);
                } else{
                    int contador = 0;
                    int contadorMes = 0;
                    float mes = 0;
                    while (contador < tempoInvest){
                        mes = (float)(valorInvest * 0.008);
                        rendimentoInvest = mes;
                        System.out.println("Mês "+ ++contadorMes +" - "+ rendimentoInvest + " R$");
                        contador++;
                    }
                    System.out.println("Total: " + rendimentoInvest * contadorMes + " R$");
                }
                break;
            case 2:
                System.out.println("""
                        Rent. Bruta a.m.: 0,64%
                        Rent. Bruta a.a.: 8,00%
                """);
                System.out.println("Informe o valor que será investido:");
                valorInvest = sc.nextFloat();
                System.out.println("Por quantos meses o valor permanecerá no investimento?");
                tempoInvest = sc.nextInt();
                if (tempoInvest >= 12 ){
                    float ano = (float) (valorInvest * 0.08);
                    rendimentoInvest = ano;
                    System.out.println(rendimentoInvest);
                } else{
                    int contador = 0;
                    int contadorMes = 0;
                    float mes = 0;
                    while (contador < tempoInvest){
                        mes = (float)(valorInvest * 0.0064);
                        rendimentoInvest = mes;
                        System.out.println("Mês "+ ++contadorMes +" - "+ rendimentoInvest + " R$");
                        contador++;
                    }
                    System.out.println("Total: " + rendimentoInvest * contadorMes + " R$");
                }
            break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        
    
    
    }
}
