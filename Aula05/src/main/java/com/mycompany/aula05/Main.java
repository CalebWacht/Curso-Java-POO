package com.mycompany.aula05;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author Caleb Wacht
 */
public class Main {
    
    private static Conta conta;
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int opcao;
         
        System.out.println("=======================");
        System.out.println("Bem vindo ao Banco CSW");
        System.out.println("=======================");
        System.out.println("Menu: \n");
        System.out.println("\n1- Abrir Conta");
        System.out.println("\n2- Fechar Conta");
        System.out.println("\n3- Deposito");
        System.out.println("\n4- Saque");
        System.out.println("\n5- Pagar Mensalidade");
        
        opcao = scanner.nextInt();
        System.out.flush();
        
        Conta contaUtilizada = null;
        int opcaoConta;
        EnumTipoConta tipoConta;
        String nome;
        
        System.out.println("\nDigite seus dados"); // abrir conta
                System.out.println("\nNome: ");
                
                nome = scanner.nextLine();
                
                System.out.println("\nTipo de Conta: ");
                System.out.println("\n1- Conta corrente ");
                System.out.println("\n2- Poupança ");
                opcaoConta = scanner.nextInt();
                if(opcaoConta == 1) {
                    tipoConta = EnumTipoConta.CC;
                } else {
                    tipoConta = EnumTipoConta.CP;
                }
                
        System.out.flush();
        
        switch(opcao){

            case 1:
                //abri conta
                contaUtilizada = conta.abrirConta(nome, tipoConta);

                System.out.println("\nConta Criada!");
                System.out.println("=======================");
                System.out.println("\nNumero: " + contaUtilizada.getNumConta());
                System.out.println("\nStatus: " + contaUtilizada.getStatus());
                System.out.println("\nTipo Conta: " + contaUtilizada.getTipoConta());
                System.out.println("=======================");

            case 2:
                // fechar conta
                contaUtilizada = conta.fecharConta(nome, tipoConta);

                System.out.println("\nConta Fechada!");
                System.out.println("=======================");
                System.out.println("\nNumero: " + contaUtilizada.getNumConta());
                System.out.println("\nStatus: " + contaUtilizada.getStatus());
                System.out.println("\nTipo Conta: " + contaUtilizada.getTipoConta());
                System.out.println("=======================");

            case 3:
                // deposito
                System.out.println("Qual valor deseja depositar? ");

                BigDecimal valorDeposito = scanner.nextBigDecimal();

                contaUtilizada = conta.depositar(nome, tipoConta, valorDeposito);

                System.out.println("\nDeposito Realizado!");
                System.out.println("=======================");
                System.out.println("\nNumero: " + contaUtilizada.getNumConta());
                System.out.println("\nStatus: " + contaUtilizada.getStatus());
                System.out.println("\nTipo Conta: " + contaUtilizada.getTipoConta());
                System.out.println("\nSaldo Atual: " + contaUtilizada.getSaldo());
                System.out.println("=======================");
            case 4:
                // saque
                System.out.println("Qual valor deseja sacar? ");

                BigDecimal valorSaque = scanner.nextBigDecimal();

                contaUtilizada = conta.sacar(nome, tipoConta, valorSaque);

                System.out.println("\nSaque Realizado!");
                System.out.println("=======================");
                System.out.println("\nNumero: " + contaUtilizada.getNumConta());
                System.out.println("\nStatus: " + contaUtilizada.getStatus());
                System.out.println("\nTipo Conta: " + contaUtilizada.getTipoConta());
                System.out.println("\nSaldo Atual: " + contaUtilizada.getSaldo());
                System.out.println("=======================");
            case 5:
                // pagar mensalidade
                
                contaUtilizada = conta.pagarMensal(nome, tipoConta);
                
                System.out.println("\nMensalidade Paga!");
                System.out.println("=======================");
                System.out.println("\nNumero: " + contaUtilizada.getNumConta());
                System.out.println("\nStatus: " + contaUtilizada.getStatus());
                System.out.println("\nTipo Conta: " + contaUtilizada.getTipoConta());
                System.out.println("\nSaldo Atual: " + contaUtilizada.getSaldo());
                System.out.println("=======================");
            default:
                System.out.println("Opção Inválida");
        }
    }
}
