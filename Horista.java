package polimorfismo;

public class Horista extends Funcionario {
	private int valorHora;
	private int horasTrab;
	
	public Horista(int id, String nome, String telefone, int matricula, String endereco) {
		super(endereco, nome, telefone, matricula, id);
	}
	@Override
	public double calcularSalario(double valorHora, double horasTrab) {
		return valorHora * horasTrab;
	}

}
