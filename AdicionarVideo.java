public class AdicionarVideo implements InterfaceAdicionarMidia{
	
	public AdicionarVideo(){
		super();
	}
	
	public Midia adicionar(String nome){
		Midia video = new Midia(nome, "mp4");
		return video;		
	}
}
