public class Midia extends MidiaAbstrata{
	
	public Midia( String nome, String extensao ){
		this.nome = nome;
		this.extensao = extensao;
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
		if(extensao.equals("mp3")){
			return 3;
		}
		if(extensao.equals("mp4")){
			return 5;
		}
		return 4;
	}
	
}
