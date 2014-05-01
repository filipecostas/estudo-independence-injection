package flpcostas.manual;

import java.util.HashMap;

public class Registra {
	private HashMap<String, Object> map;
	public Autor test;

	public HashMap<String, Object> getMap() {
		return (HashMap<String, Object>) map;
	}

	public Registra() {
		test =	new Fabrica<Autor>().criar("flpcostas.manual.AutorLivro");

	}

	public void adiciona(String chave, Object obj) {
		this.map.put(chave, obj);
	}

}
