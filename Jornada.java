package polimorfismo;
public class Jornada extends Funcionario {

	public Jornada(int id, String nome, String telefone, int matricula, String endereco) {
		super(endereco, nome, telefone, matricula, id);
	}
	@Override
	public double calcularSalario(double salarioBruto, double descInss) {
		return(salarioBruto - descInss) ;
	}

}
