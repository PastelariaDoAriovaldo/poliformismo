package polimorfismo;

public class ProfissioPrincipal {
	public static void main(String[] args) {
		ProfissionalSaude profissionalS = new ProfissionalSaude("Mc Jacaré", "Enfermagem", 655);
		System.out.println(profissionalS.getEspecialidade());
		profissionalS.agendarConsulta();
		
		Medico medico = new Medico("Robertão do Gás", "Neurocirurgia", 444, "Válido");
		System.out.println(profissionalS.getEspecialidade());
		medico.agendarConsulta();
		
		Dentista denstista = new Dentista("Lucas", "Remoção de cárie", 500, "Válido");
		System.out.println(denstista.getNome());
		denstista.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("DJ Azeitona", "Desentortar dedo Mindinho", 408, "Válido");
		System.out.println(fisioterapeuta.getNome());
		fisioterapeuta.agendarConsulta();
	}

}
