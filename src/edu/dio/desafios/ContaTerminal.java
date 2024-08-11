package edu.dio.desafios;


public class ContaTerminal {
	private int numeroDaConta;
	private String agencia;
	private String nomeDoCliente;
	private double saldo;
	
	public ContaTerminal() {
		
	}
	
	public ContaTerminal(int numeroDaConta, String agencia, String nomeDoCliente, double saldo) {
		setNumeroDaConta(numeroDaConta);
		setAgencia(agencia);
		setNomeDoCliente(nomeDoCliente);
		setSaldo(saldo);
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
