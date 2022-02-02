public class AdicionarMidia implements InterfaceAdicionarMidia{
	
	private String extensao;
	
	public AdicionarMidia(String extensao){
		super();
		this.extensao = extensao;
	}
	
	public Midia adicionar(String nome){
		Midia midia = new Midia(nome, extensao);
		return midia;		
	}
}
