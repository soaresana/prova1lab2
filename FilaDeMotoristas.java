
public class FilaDeMotoristas {

	private CelulaMotorista frente; // Celula cabeca.
	private CelulaMotorista tras; // Ultima celula.
	private int qtde;

	// Funcao construtora. Inicia a fila de motoristas e faz a frente e trás apontarem para a celula cabeça
	public FilaDeMotoristas() {
		frente = new CelulaMotorista();
		tras = frente;
	}

	// Insere um novo Motorista na Fila
	public void enfileira(Motorista novoMotorista) {
		CelulaMotorista aux = tras;
		tras.prox = new CelulaMotorista(novoMotorista, aux, null);
		tras = tras.prox;
		qtde++;
	}

	// Verifica o motorista mais próximo do cliente dentro de um raio de 3km e retorna-o
	public Motorista desinfileraComMenosDe3Km(Cliente novoCliente) {
		if (frente != tras) {
			boolean achou = false;
			CelulaMotorista aux = frente.prox;
			while (aux != null && !achou) {
				achou = (-3 < aux.motorista.getLocalização() - novoCliente.getLocalização())
						&& (aux.motorista.getLocalização() - novoCliente.getLocalização() < 3);
				if (achou) {
					aux.ant.prox = aux.prox;
					if (aux.prox != null)
						aux.prox.ant = aux.ant;
					qtde--;
					return aux.motorista;
				}
				aux = aux.prox;
			}

			// Caso não encontre motorista disponivel dentro do raio de 3Km, avisará o cliente 
			// que não temos motorista disponível na região no momento.
			return new Motorista("Infelizmente não temos motoristas disponíves na sua região no momento :(");

		} else
			// Caso a fila esteja vazia, ele informará ao cliente que não há motoristas na região. 
			return new Motorista("Infelizmente não temos motoristas disponíves na sua região no momento :(");
	}

	public int getQtde() {
		return qtde;
	}

}