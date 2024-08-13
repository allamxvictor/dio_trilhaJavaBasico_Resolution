package edu.dio.desafios;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ContaTerminal contaBancaria = new ContaTerminal();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número da agência: ");
		String agencia = scan.nextLine().trim();
		contaBancaria.setAgencia(agencia);
		
		System.out.println("Digite o número da conta: ");
		int conta = scan.nextInt();
		contaBancaria.setNumeroDaConta(conta);
		
		scan.nextLine();

		System.out.println("Nome do cliente: ");
		String nomeDoCliente = scan.nextLine().trim();
		contaBancaria.setNomeDoCliente(nomeDoCliente);
		
		System.out.println("Atualizar saldo: ");
		double saldo = scan.nextDouble();
		contaBancaria.setSaldo(saldo); // não é um depósito.
		
		System.out.println("Olá " + contaBancaria.getNomeDoCliente() +", obrigado por criar uma conta"
				+ " em nosso banco, sua agência é " + contaBancaria.getAgencia() + ", conta "  + 
				contaBancaria.getNumeroDaConta() + " e seu saldo de " + contaBancaria.getSaldo() + 
				" já está disponível para saque.");
		
		scan.close();
		
		
		
	}
}
