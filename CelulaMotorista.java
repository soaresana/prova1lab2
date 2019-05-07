public class CelulaMotorista {

	public Motorista motorista; 
	public CelulaMotorista ant;
	public CelulaMotorista prox;

	public CelulaMotorista() {
		motorista = null;
		ant = null;
		prox = null;
	}

	public CelulaMotorista(Motorista novoMotorista) {
		motorista = novoMotorista;
		ant = null;
		prox = null;
	}

	//Método construtor da celula motorista 
	public CelulaMotorista(Motorista novoMotorista, CelulaMotorista celulaAnt, CelulaMotorista proxCelula) {
		motorista = novoMotorista;
		ant = celulaAnt;
		prox = proxCelula;
	}
}
