package flpcostas.dominio;

public class Livro {
	
	private String titulo;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		super();
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
}
