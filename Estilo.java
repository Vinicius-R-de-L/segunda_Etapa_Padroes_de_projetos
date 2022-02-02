public class Estilo{
	private String tema;
	private String fonte;
	private String tamanho;

	public Estilo tema(String tema){
		this.tema = tema;
		return this;
	}

	public Estilo comFonte(String fonte){
		this.fonte = fonte;
		return this;
	}

	public Estilo eTamanho(String tamanho){
		this.tamanho = tamanho;
		return this;
	}

	@Override
	public String toString(){
		return "\n\n\tTema: " + this.tema + " Com Fonte: " + this.fonte + " e Tamanho: " + this.tamanho;
	}
}
