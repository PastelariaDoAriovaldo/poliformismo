package polimorfismo;

public class ConsultorPJ extends Funcionario{
	private int imposto;

	public ConsultorPJ(int id, String nome, String telefone, int matricula, String endereco) {
		super(endereco, nome, telefone, matricula, id);
	}
	@Override
	public double calcularSalario(double salarioBruto, double desc) {
		return (salarioBruto - imposto);
	
	}
}
