
public class Motorista {

	private int id;
	private boolean vip;
	private String nome;
	private double localização; // a localização do motorista deve ser inserida considerando os kms dentro de uma 
								// linha hipotética representando a cidade
	
	// Método contrutor do motorista
	public Motorista(int id, boolean vip, String nome, double localização ) {
		this.id = id;
		this.vip = vip;
		this.nome = nome;
		this.localização = localização;
		System.out.println(nome+" foi cadastrado com sucesso! Seu ID é "+id);
	}
	
	public Motorista(String nome) {
		this.nome = nome;
	}
	
	public Motorista(int id, String nome, double localização ) {
		this.id = id;
		this.vip = false;
		this.nome = nome;
		this.localização = localização;
	}
	
	public Motorista(int id, boolean vip, String nome) {
		this.id = id;
		this.vip = vip;
		this.nome = nome;
		this.localização = 0;
	}
	
	public Motorista(int id, String nome) {
		this.id = id;
		this.vip = false;
		this.nome = nome;
		this.localização = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public double getLocalização() {
		return localização;
	}
	public void setLocalização(double localização) {
		this.localização = localização;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
