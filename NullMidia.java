public class NullMidia extends MidiaAbstrata{
	
	public NullMidia(){
		this.nome = "Midia nao encontrada";
		this.extensao = "";
	}
	
	@Override
	public String getNome(){
		return this.nome;
	}
	@Override
	public String getExtensao(){
		return this.extensao;
	}
	
	@Override
	public int tamanho(){
		return 0;
	}
	
}
