package atividade01Poo;

import java.util.Scanner;

public class contaBancaria {

	Scanner scanner = new Scanner(System.in);

	private int numeroConta;
	private int agenciaConta;
	public double saldoAtual;

	public contaBancaria() {
	}

	public contaBancaria(int numeroConta, int agenciaConta, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.agenciaConta = agenciaConta;
		this.saldoAtual = saldoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(int agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldo(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public void extrato() {
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Agência: " + agenciaConta);
		System.out.println("Saldo atual: " + saldoAtual);
	}

	public void fazerDeposito(double valor) {

		System.out.println("Digite o valor do seu depósito: ");
		saldoAtual += valor;
		System.out.println("---------------------------------------------------------- \n");
		System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");

	}

	public void fazersaque(double valor) {
		if (valor > saldoAtual) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldoAtual -= valor;
			System.out.println("---------------------------------------------------------- \n");
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		}
	}
}
