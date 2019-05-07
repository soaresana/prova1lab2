
public class Cliente {
	

	private String nome;
	private double localizacao; // a localização do cliente deve ser inserida considerando os kms dentro de uma 
								// linha hipotética representando a cidade
	
	
	
	public Cliente(String nome, double localizacao) {
		this.nome = nome;
		this.localizacao = localizacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLocalização() {
		return localizacao;
	}

	public void setLocalização(double localizacao) {
		this.localizacao = localizacao;
	}
	
	
	
	
	

}
