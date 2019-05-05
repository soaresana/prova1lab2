
public class FilaDeMotoristas {
	

	   private CelulaMotorista frente; // Celula cabeca.
	   private CelulaMotorista tras; // Ultima celula.
	   private int qtde;
	   
	   // Funcao construtora. Cria a celula cabeca e faz as referencias frente e tras apontarem para ela.
	   public FilaDeMotoristas() {
	      frente = new CelulaMotorista();
	      tras = frente;
	   }

	   // Verifica se a fila esta vazia. Retorna TRUE se a fila estiver vazia e FALSE caso contrario.
	   public boolean vazia() {
	      return frente == tras;
	   }

	   public void mostra() {
	      System.out.print("[ ");
	      for (CelulaMotorista c = frente.prox; c != null; c = c.prox)
	         System.out.print(c.id + " ");
	      System.out.println("] ");
	   }

	   // Insere um novo Item no fim da fila.
	   // O parametro "valorItem" e um Object contendo o elemento a ser inserido no final da fila.
	   public void enfileira(int valorItem) {
	      tras.prox = new CelulaMotorista(valorItem);
	      tras = tras.prox;
	      qtde++;
	   }

	   // Retira e retorna o primeiro elemento da fila.
	   // Retorna um Object contendo o primeiro elemento da fila. Caso a fila esteja vazia retorna null.
	   public Object desenfileira()
	   {
	      Object item = null;
	      if (frente != tras) {
	         frente = frente.prox;
	         item = frente.id;
	         qtde--;
	      }
	      return item;
	   }

	   // Retorna o primeiro Item da fila sem remove-lo.
	   // Retorna um Object contendo o primeiro Item da fila.
	   public Object peek() {
	      if (frente != tras)
	         return frente.prox.id;
	      else
	         return null;
	   }

	   // Verifica se o Item passado como parametro esta contido na fila.
	   // O parametro "valorItem" e um object contendo o Item a ser localizado.
	   // O metodo retorna TRUE caso o item esteja presente na fila.
	   public boolean contem(int valorItem) {
	      boolean achou = false;
	      CelulaMotorista aux = frente.prox;
	      while (aux != null && !achou) {
	         achou = aux.id.equals(valorItem);
	         aux = aux.prox;
	      }
	      return achou;
	   }

	   // Verifica se o Item passado como parametro esta contido na fila. (Obs: usa o comando FOR)
	   // Recebe como parametro um object contendo o Item a ser localizado.
	   // Retorna TRUE caso o Item esteja presente na fila.
	   public boolean contemFor(int valorItem) {
	      boolean achou = false;
	      for (CelulaMotorista aux = frente.prox; aux != null && !achou; aux = aux.prox)
	         achou = aux.id.equals(valorItem);
	      return achou;
	   }

	   // Metodo que retorna a quantidade de itens da fila.
	   public int quantidade() {
	      return qtde;
	   }
	   
	   // [Ex9] Na classe CFila crie o métodovoid limpa()que apaga todos os elementos de umaCFila.
	   public void limpa() {
		   tras = frente;
		   qtde = 0;
	   }
	   
	   // [Ex10] Na classe CFila crie o método void furaFila(Object item)que insere o item no início da CFila
	   public void furaFila(int item) {
		   CelulaMotorista novacelula = new CelulaMotorista(item);
		   novacelula.prox = frente.prox;
		   frente.prox = novacelula;
		   qtde ++;
	   }

	public CelulaMotorista getFrente() {
		return frente;
	}

	public void setFrente(CelulaMotorista frente) {
		this.frente = frente;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Object retornaIndice(int posicao) {
		CelulaMotorista c = frente.prox;
		for (int aux = 1; aux < posicao; aux++) {
			if (c.prox == null) {
				break;
			}else {
			c=c.prox;
			}
			}
		System.out.println(c.id);
		return c.id;
		}

	public int somaDosElementros() {
		int soma = 0;
	    for (CelulaMotorista c = frente.prox; c != null; c = c.prox) {
	        soma += (int)c.id;
	    }
	    return soma;
	}

		public int numeroDeElementosPositivos() {
			int positivos = 0;
			for (CelulaMotorista c = frente.prox; c != null; c = c.prox)
				if ((int) c.id >= 0)
					positivos++;
			return positivos;
		}

		public int numeroDeOcorrencias(int numero) {
			;
			int ocorrencias = 0;
			for (CelulaMotorista c = frente.prox; c != null; c = c.prox)
				if (numero == (int) c.id)
					ocorrencias++;
			return ocorrencias;
		}

}
