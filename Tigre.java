package polimorfismo;

public class Tigre extends Animal{
	
	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println("O trigue están roncando");
	}

}
