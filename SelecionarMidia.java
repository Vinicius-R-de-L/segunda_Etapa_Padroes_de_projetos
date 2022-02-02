import java.util.ArrayList;
import java.util.List;

public abstract class SelecionarMidia {
	private SelecionarMidia proximo;
	List<MidiaAbstrata> listaDeMidias;
	
	public SelecionarMidia(SelecionarMidia proximo, List<MidiaAbstrata> listaDeMidias) {
		this.proximo = proximo;
		this.listaDeMidias = listaDeMidias;
	}

	public MidiaAbstrata selecionar(String nome) {
		MidiaAbstrata midia = selecionarMidia(nome);
		if (midia instanceof NullMidia)
			return chamarProximo(nome);
		else
			return midia;
	}

	private MidiaAbstrata chamarProximo(String nome) {
		if (proximo == null)
			return proximo.selecionar(nome);
		return new NullMidia();
	}

	protected abstract MidiaAbstrata selecionarMidia(String nome);
}
