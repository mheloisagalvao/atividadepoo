package atividade01Poo;

public class Endereco {

	private int cep;
	private String logradouro;
	private int numero;

	public Endereco() {
	}

	public Endereco(int cep, String logradouro, int numero) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}