package flpcostas.program;


import flpcostas.manual.Autor;
import flpcostas.manual.AutorLivro;
import flpcostas.manual.Fabrica;
import flpcostas.manual.Publicacao;
import flpcostas.manual.Registra;

/**
 * Executando ID manualmente Injecao de dependencia mais basica possivel Com
 * base nas duas classes de dominio criada. Autor e Livro
 * 
 * @author Filipe
 * 
 */
public class ProgramManual {

	public static void main(String[] args) {
		
		// fica claro que Publicacao depende de um Autor...
		// nesse caso e AutorLivro
		// instancia AutorLivro explicidamente
		Publicacao pub1 = new Publicacao((Autor) new AutorLivro());
		System.out.println("explicito: "+pub1.getAutor().getClass());

		// Fabrica de autor livro
		Publicacao pub2 = new Publicacao(new Fabrica<Autor>().criar("flpcostas.manual.AutorLivro"));
		System.out.println("fabrica: "+pub2.getAutor().getClass());
		
		//Registra autor livro
		Registra reg = new Registra();
		Publicacao pub3 = new Publicacao(reg.test);
		System.out.println("registra fabrica: "+pub3.getAutor().getClass());
	}

}
