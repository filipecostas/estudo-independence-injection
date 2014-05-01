package flpcostas.manual;

import flpcostas.dominio.Autor;
import flpcostas.dominio.Livro;

/**
 * Executando ID manualmente
 * 
 * Com base nas duas classes de dominio criada. Autor e Livro
 * 
 * @author Filipe
 *
 */
public class ProgramManual {

	public static void main(String[] args) {

		//precisar criar o autor
		Autor autor = new Autor();
		//fica claro que livro depende de um autor...
		Livro livro = new Livro(autor);
	}
	
}
