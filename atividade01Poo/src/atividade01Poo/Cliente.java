package atividade01Poo;

import java.util.ArrayList;

public class Cliente {

	private int cpf;
	private String nome;
	private ArrayList<contaBancaria> listaContas = new ArrayList<contaBancaria>();
	private Endereco endereco;
	private ArrayList<Telefone> listaTelefones = new ArrayList<Telefone>();

	public Cliente() {
	}

	public Cliente(int cpf, String nome, ArrayList<contaBancaria> listaContas, Endereco endereco,
			ArrayList<Telefone> listaTelefone) {

		this.cpf = cpf;
		this.nome = nome;
		this.listaContas = listaContas;
		this.endereco = endereco;
		this.listaTelefones = listaTelefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<contaBancaria> getListaContas() {
		return listaContas;
	}

	public void setListaContas(ArrayList<contaBancaria> listaContas) {
		this.listaContas = listaContas;
	}

	public void addConta(contaBancaria novaConta) {
		this.listaContas.add(novaConta);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Telefone> getListaTelefone() {
		return listaTelefones;
	}

	public void setListaTelefone(ArrayList<Telefone> listaTelefone) {
		this.listaTelefones = listaTelefone;
	}

	public void addTelefone(Telefone novoTelefone) {
		this.listaTelefones.add(novoTelefone);
	}

}
