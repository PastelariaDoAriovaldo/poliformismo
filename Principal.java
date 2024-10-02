package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Scott", "A", "Lobisomem");
		lobo.emitirSom();
		
		Leao leao = new Leao("Laval", "M", "Qualquer");
		leao.emitirSom();
		
		Tigre tigre  = new Tigre("Pintado", "F", "Qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("Scooby", "M", "Caçadpr de Fantasma");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Garfield", "M", "Lasanha");
		gato.emitirSom();
	}

}
