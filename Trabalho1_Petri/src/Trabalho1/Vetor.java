package Trabalho1;

public class Vetor {

	private int tamanho;
	private String vetor[];
	private String nomePesquisado;
	private int contador = 0;

	public Vetor(int tamanho) {
		if (tamanho > 0) {
			this.tamanho = tamanho;
			this.vetor = new String[this.tamanho];
		} else {
			System.out.println("Não é possível criar um vetor com nenhuma posição (ou com posição negativa).");
		}
	}

	public void insere(String nome) {
		if (contador == tamanho) {
			contador = 0;
		}
		if (vetor[contador] == null) {
			vetor[contador] = nome;
			System.out.println("Nome inserido no vetor na posição [" + contador + "].");
			contador++;

		} else {
			do {
				contador++;
				if (vetor[contador] == null) {
					vetor[contador] = nome;
					break;
				} else if (contador == tamanho-1) {
					System.out.println("O vetor está cheio.");
					break;
				}
			} while (vetor[contador] != null && contador < tamanho-1);
		     
		}
	}

	public void remove(int posicao) {
		vetor[posicao] = null;
	}

	public String buscaElemento(int posicao) {
		if (vetor[posicao] != null) {
			nomePesquisado = vetor[posicao];
		} else {
			nomePesquisado = "vazio";
		}
		return nomePesquisado;
	}
}
