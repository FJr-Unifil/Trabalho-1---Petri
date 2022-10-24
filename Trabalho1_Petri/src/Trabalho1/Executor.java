package Trabalho1;

public class Executor {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.insere("Fernando");
		vetor.insere("Gustavo");
		vetor.remove(1);
		vetor.insere("Lucas");
		vetor.insere("Mateus");
		vetor.insere("Matheus");
		vetor.insere("Moisés");
		vetor.remove(3);
		System.out.println(vetor.buscaElemento(0));
		System.out.println(vetor.buscaElemento(1));
		System.out.println(vetor.buscaElemento(2));
		System.out.println(vetor.buscaElemento(3));
		System.out.println(vetor.buscaElemento(4));
		vetor.insere("Calvão");
		System.out.println(vetor.buscaElemento(3));
		vetor.insere("Testando");
	}
}
