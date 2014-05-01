package flpcostas.manual;

public class Fabrica<T> {

	@SuppressWarnings("unchecked")
	public T criar(String nome) {
		try {
			return (T) Class.forName(nome).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
