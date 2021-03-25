package Turismo;

public class viagem {
	private String destino;
	private int qtdeDeDias;
	private double valorDeDestino;
	
//construtor passando como parametro somente destino e quantidade de dias.
	public viagem(String destino, int qtdeDeDias) {
		this.destino = destino;
		this.qtdeDeDias = qtdeDeDias;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int getQtdeDeDias() {
		return qtdeDeDias;
	}

	public void setQtdeDeDias(int qtdeDeDias) {
		this.qtdeDeDias = qtdeDeDias;
	}
	public void setValorDeDestino(double valorDeDestino) {
		this.valorDeDestino = valorDeDestino;
	}
/*metodo feito para calcular o valor do destino escolhido,
 *  usando switch ao cair em um dos casos possiveis 
 *  sera calculado o valor da viagem de destino vezes a quantidade de dias*/
	public void escolhaDestino(String destino, int qtdeDeDias) {

		switch (destino.toLowerCase()) {
		case "ilhabela":
			valorDeDestino = 477*qtdeDeDias;
			break;
		case "fernando de noronha":
			valorDeDestino = 454*qtdeDeDias;
			break;
		case "ubatuba":
			valorDeDestino = 679*qtdeDeDias;
			break;
		case "praia da rosa":
			valorDeDestino = 853*qtdeDeDias;
			break;
		case "praia da pipa":
			valorDeDestino = 1324*qtdeDeDias;
			break;
		}
	}
	//metodo para apresentaçao dos valores atribuitos as variaveis
	public String toString() {
		return "Destino escolhido:"+destino+
				"\nQuantidade de dias a ficar: "+qtdeDeDias+
				"\nValor pela viagem: "+valorDeDestino;
	}

}
