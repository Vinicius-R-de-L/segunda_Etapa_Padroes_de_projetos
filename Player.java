import java.util.ArrayList;
import java.util.List;

public class Player implements Observavel{
	private String nome;
	private List<Observador> observadores = new ArrayList<Observador>();

	public Player() {
		super();
		this.nome = "Player";
	}

	public void adicionarObservador(Observador observador){
		observadores.add(observador);
	}

	public void removerObservador(Observador observador){
		observadores.remove(observador);
	}

	public void limparObservadores(){
		observadores = null;
		observadores = new ArrayList<Observador>();
	}

	public String getNome(){
		return nome;
	}

	private List<Observador> getObservadores(){
		return observadores;
	}

	@Override
	public String toString(){
		return nome;
	}

	public void notificar(String midia){
		for (Observador o : observadores)
			o.notificar(midia);
	}
}
