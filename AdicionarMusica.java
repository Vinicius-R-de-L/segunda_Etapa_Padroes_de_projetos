public class AdicionarMusica implements InterfaceAdicionarMidia{
	
	public AdicionarMusica(){
		super();
	}
	
	public Midia adicionar(String nome){
		Midia musica = new Midia(nome, "mp3");
		return musica;		
	}
}
