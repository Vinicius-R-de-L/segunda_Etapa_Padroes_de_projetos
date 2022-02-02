public class Dispositivo implements Observador{

	private String nome;

	public Dispositivo(String nome){
		super();
		this.nome = nome;
	}

	public void notificar(String midia){
		System.out.println("\n\n\t\t" + nome + " esta reproduzindo: " + midia);
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}
