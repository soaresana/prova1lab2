
public class Sistema {
	
	private int aux;
	private FilaDeMotoristas filaVIP;
	private FilaDeMotoristas filaNormal;

	public Sistema() {
		this.aux=0;
		this.filaVIP = new FilaDeMotoristas();
		this.filaNormal = new FilaDeMotoristas();
		System.out.println("Sistema inicializado com sucesso!");

	}

	//Verifica em qual fila o motorista deve entrar e enfileira-o
	public void enfilera(Motorista novoMotorista) {
		if (novoMotorista.isVip())
			filaVIP.enfileira(novoMotorista);
		else
			filaNormal.enfileira(novoMotorista);
	}
	
	//Método que verifica qual motorista deve ser chamado, a cada dois motoristas VIPs um normal deve ser chamado. 
	public Motorista chamadaParaCorrida(Cliente novoCliente) {
		if (aux > 2)
			aux = 0;
		switch (aux) {
		case 0:
			aux++;
			return chamaDaFilaVIP(novoCliente);
		case 1:
			aux++;
			return chamaDaFilaVIP(novoCliente);
		case 2:
			aux++;
			return chamaDaFilaNormal(novoCliente);
		}
		return null;
	}
    //Método que chama o motorista para a corrida, verificando primeiro a fila VIP, 
	// caso não encontre motoristas disponível na fila VIP em um raio de 3km, irá verificar na fila normal. 
	public Motorista chamaDaFilaVIP(Cliente novoCliente) {
		if (filaVIP.getQtde() != 0)
			return filaVIP.desinfileraComMenosDe3Km(novoCliente);
		else {
			if (filaNormal.getQtde() != 0) {
				return filaNormal.desinfileraComMenosDe3Km(novoCliente);
			} 
			//Caso ambas as filas de motoristas estejam vazias, avisará o cliente que não há motoristas disponiveis na região.
			else 
				return new Motorista("Infelizmente não temos motoristas disponíves na sua região no momento :(");
		}
	}
	
	 //Método que chama o motorista para a corrida, verificando primeiro a fila Normal, 
	// caso não encontre motoristas disponível na fila normal em um raio de 3km, irá verificar na fila VIP. 
	public Motorista chamaDaFilaNormal(Cliente novoCliente) {
		if (filaNormal.getQtde() != 0) {
			return filaNormal.desinfileraComMenosDe3Km(novoCliente);
		} else {
			if (filaVIP.getQtde() != 0) {
				return filaVIP.desinfileraComMenosDe3Km(novoCliente);
			} 
			//Caso ambas as filas de motoristas estejam vazias, avisará o cliente que não há motoristas disponiveis na região.
			else {
				return new Motorista("Infelizmente não temos motoristas disponíves na sua região no momento :(");
			}
		}
	}

}
