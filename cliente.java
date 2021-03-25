package Turismo;

public class cliente {
	//Atributos da classe
	private String nome;
	private float cpf;
	private int idade;
	private String endereco;
	private int tel;
//construtor criado para evitar que seja criado um objeto com valores nulos
	public cliente(String nome, float cpf, int idade, String endereco, int tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	public String toString() {
		return "Nome: "+nome+"\nCPF: "+cpf
			+"\nIdade: "+ idade +"\nEndereço: "
			+ endereco+ "\nTelefone: "+tel;
	}
}
