
public class Aplicação {
	
	public static void main(String[] args) {
		
		// Inicializando o sistema
		Sistema sistema = new Sistema();
		
		//Cadastrando Motoristas
		sistema.enfilera(new Motorista(13423,false, "João da Silva", 3.4));
		sistema.enfilera(new Motorista(54234,true, "Maria Cristina", 0.6));
		sistema.enfilera(new Motorista(65435,false, "Romário Júnior", 5));
		sistema.enfilera(new Motorista(65423,true, "Joaquim Almeida", 8.7));
		sistema.enfilera(new Motorista(87649,false, "Tereza Cristina", 12));
		sistema.enfilera(new Motorista(32134,true, "Caetano Veloso", 2));
		sistema.enfilera(new Motorista(21319,false, "Jorgina", 3));
		sistema.enfilera(new Motorista(54322,true, "Manoel", 7));
		sistema.enfilera(new Motorista(54324,false, "Joaquina Silva", 5));
		sistema.enfilera(new Motorista(43213,true, "Matheus Limões", 8));
		sistema.enfilera(new Motorista(34241,false, "Maria Tereza Araujo", 11));
		
		//Chamando motoristas para testes
		System.out.println("Novo motorista chamado! O motorista chamado para a corrida será: "+sistema.chamadaParaCorrida(new Cliente("Carla Vieira", 11)).getNome());
		System.out.println("Novo motorista chamado! O motorista chamado para a corrida será: "+sistema.chamadaParaCorrida(new Cliente("Ana Luiza", 6)).getNome());
		System.out.println("Novo motorista chamado! O motorista chamado para a corrida será: "+sistema.chamadaParaCorrida(new Cliente("Mariana", 2)).getNome());
		System.out.println("Novo motorista chamado! O motorista chamado para a corrida será: "+sistema.chamadaParaCorrida(new Cliente("João Machado", 4)).getNome());
		System.out.println("Novo motorista chamado! O motorista chamado para a corrida será: "+sistema.chamadaParaCorrida(new Cliente("Carla Vieira", 11)).getNome());
		
	}

}
