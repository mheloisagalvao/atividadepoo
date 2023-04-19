package atividade01Poo;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Registro registro = new Registro();
		contaBancaria conta = new contaBancaria();
		int opcao = 0;
		int dados = 0;

		try {
			while (opcao != 5) {

				System.out.println("Menu:\n" + " 1 - Cadastrar cliente\n" + " 2 - Listar clientes\n"
						+ " 3 - Excluir cliente\n" + " 4 - Dados da conta bancária\n" + " 5 - Sair do programa\n");

				opcao = scanner.nextInt();

				System.out.println("---------------------------------------------------------- \n");

				switch (opcao) {

				case 1:
					registro.registrarCliente();
					break;
				case 2:
					registro.exibirClientes();
					break;
				case 3:
					registro.apagarClientes();
					break;
				case 4:
					while (dados != 4) {
						System.out.println("Dados da conta bancária:\n" + " 1 - Extrato\n" + " 2 - Fazer depósito\n"
								+ " 3 - Realizar saque\n" + " 4 - Sair");

						dados = scanner.nextInt();

						switch (dados) {
						case 1:
							conta.extrato();
							break;
						case 2:
							System.out.println("Digite o valor do depósito: ");
							double valorDeposito = scanner.nextDouble();
							conta.fazerDeposito(valorDeposito);
							conta.extrato();
							break;
						case 3:
							System.out.println("Digite o valor do saque: ");
							double valorSaque = scanner.nextDouble();
							conta.fazersaque(valorSaque);
							conta.extrato();
							break;
						default:
							System.out.println("Opção inválida.");
							break;
						}
						break;
					}

				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}