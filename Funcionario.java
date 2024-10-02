package polimorfismo;

public class Funcionario {
	private String nome;
	private String telefone;
	private String endereco;
	private int id;
	private int matricula;

	public Funcionario(String nome, String telefone, String endereco, int id, int matricula) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.id = id;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double calcularSalario(double salarioBruto, double desc) {
		return salarioBruto - desc;
	}
}
