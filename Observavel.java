public interface Observavel{

	public void adicionarObservador(Observador observador);

	public void removerObservador(Observador observador);

	public void notificar(String midia);

	public void limparObservadores();
}
