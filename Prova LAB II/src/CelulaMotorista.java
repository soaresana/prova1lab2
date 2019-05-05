public class CelulaMotorista {

	public int id;
	public CelulaMotorista ant;
	public CelulaMotorista prox;

	public CelulaMotorista() {
		id = 0;
		ant = null;
		prox = null;
	}

	public CelulaMotorista(int valorId) {
		id = valorId;
		ant = null;
		prox = null;
	}

	public CelulaMotorista(int valorId, CelulaMotorista celulaAnt, CelulaMotorista proxCelula) {
		id = valorId;
		ant = celulaAnt;
		prox = proxCelula;
	}
}
