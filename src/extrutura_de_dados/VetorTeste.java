package extrutura_de_dados;

import java.util.ArrayList;

public class VetorTeste {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		
		System.out.println(lista.tamanho());
		lista.adiciona(aluno1);
		System.out.println(lista.tamanho());
		lista.adiciona(aluno2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(aluno1));
		Aluno aluno3 = new Aluno("Danilo");
		System.out.println(lista.contem(aluno3));
		
		lista.adiciona(1,aluno3);
		
		lista.remove(1);
		System.out.println(lista);
		
		for(int i = 0; i < 300; i++) {
			Aluno y = new Aluno("Joao " + i);
			lista.adiciona(y);
		}
		System.out.println(lista);
		
		ArrayList<Aluno> listaDoJava = new ArrayList<Aluno>();
	}

}
