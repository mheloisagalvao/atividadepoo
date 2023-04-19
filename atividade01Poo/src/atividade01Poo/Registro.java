package atividade01Poo;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

	Scanner scanner = new Scanner(System.in);

	Cliente cliente = new Cliente();

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Registro() {
	}

	public Registro(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	private Cliente adicionarCliente() {

		Cliente cliente = new Cliente();

		System.out.println("Digite o nome do novo cliente: ");
		cliente.setNome(scanner.nextLine());
		System.out.println("Digite o CPF do novo cliente: ");
		cliente.setCpf(scanner.nextInt());
		System.out.println("---------------------------------------------------------- \n");

		return cliente;
	}

	private contaBancaria adicionarConta() {

		contaBancaria conta = new contaBancaria();

		System.out.println("Digite o número da conta: ");
		conta.setNumeroConta(scanner.nextInt());
		System.out.println("Digite o nome da agência: ");
		conta.setAgenciaConta(scanner.nextInt());
		System.out.println("Digite o saldo atual da conta: ");
		conta.setSaldo(scanner.nextInt());

		System.out.println("---------------------------------------------------------- \n");

		return conta;
	}

	private Endereco adicionarEndereco() {

		Endereco endereco = new Endereco();

		System.out.println("Digite o CEP: ");
		endereco.setCep(scanner.nextInt());
		System.out.println("Digite o logradouro do endereço: ");
		endereco.setLogradouro(scanner.next());
		System.out.println("Digite o número do endereço: ");
		endereco.setNumero(scanner.nextInt());
		System.out.println("---------------------------------------------------------- \n");

		return endereco;
	}

	private Telefone adicionarTelefone() {

		Telefone telefone = new Telefone();

		System.out.println("Digite o DDD do telefone: ");
		telefone.setDdd(scanner.nextInt());
		System.out.println("Digite o número do telefone: ");
		telefone.setNumeroTelefone(scanner.nextInt());
		System.out.println("---------------------------------------------------------- \n");

		return telefone;

	}

	public void registrarCliente() {

		Cliente cliente = adicionarCliente();
		contaBancaria conta = adicionarConta();
		Endereco endereco = adicionarEndereco();
		Telefone telefone = adicionarTelefone();

		cliente.addConta(conta);
		cliente.setEndereco(endereco);
		cliente.addTelefone(telefone);

		clientes.add(cliente);
	}

	public void exibirClientes() {

		for (int i = 0; i < clientes.size(); i++) {

			System.out.println(clientes.get(i).getNome());
		}

		System.out.println("---------------------------------------------------------- \n");
	}

	public void apagarClientes() {

		System.out.println("Digite o CPF do cliente que deseja excluir: ");
		int cpf = scanner.nextInt();

		for (int i = 0; i < clientes.size(); i++) {

			Cliente cpfCliente = clientes.get(i);

			if (cpfCliente.getCpf() == cpf) {

				System.out.println("O cliente " + cpfCliente.getNome() + " foi excluído do sistema.");
				clientes.remove(i);
				System.out.println("---------------------------------------------------------- \n");

			} else {

				System.out.println("Não foi encontrado cliente com este CPF n");
				System.out.println("---------------------------------------------------------- \n");
			}
		}
	}

}