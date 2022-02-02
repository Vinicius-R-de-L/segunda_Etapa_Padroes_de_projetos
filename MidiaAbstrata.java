public abstract class MidiaAbstrata{
	protected String nome;
	protected String extensao;
	
	public abstract String getNome();
  
	public abstract String getExtensao();
	
	public void setNome(String nome){
		this.nome = nome;
	}
  
	public void setExtensao(String extensao){
		this.extensao = extensao;
	}
	
	public int tamanhoDoArquivo(){
		return nome.length() * tamanho();
	}
	
	public abstract int tamanho();
}
