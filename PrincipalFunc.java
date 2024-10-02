package polimorfismo;

public class PrincipalFunc {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("PDiddy", "Joaquina", "0888888800", 6, 7);
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.calcularSalario(8000, 20));
		
		Horista horista = new Horista(2, "Jay Z", "7552387909", 312, "Escola Sesi");
		System.out.println( horista.getNome());
		System.out.println( horista.calcularSalario(1000, 10));

		Jornada jornada = new Jornada(6, "Oleo de bebe", "159987654", 9, "Festa do Diddy");
		System.out.println( jornada.getNome());
		System.out.println(jornada.calcularSalario(4200, 69));

		ConsultorPJ conlsultorpj = new ConsultorPJ(4, "Justin B", "2199156743", 2, "World Trader Center");
		System.out.println( conlsultorpj.getNome());
		System.out.println(conlsultorpj.calcularSalario(1000, 720 ));
	}

}
                                 