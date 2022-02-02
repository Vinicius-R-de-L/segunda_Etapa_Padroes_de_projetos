import java.util.ArrayList;
import java.util.List;

public class Outro extends SelecionarMidia {

	public Outro(SelecionarMidia proximo, List<MidiaAbstrata> listaDeMidias) {
		super(proximo, listaDeMidias);
	}

	protected MidiaAbstrata selecionarMidia(String nome) {
		for(int i = 0 ; i < listaDeMidias.size() ; ++i ){
			if(nome.equals(listaDeMidias.get(i).getNome()) && !(listaDeMidias.get(i).getExtensao().equals("mp3")) && !(listaDeMidias.get(i).getExtensao().equals("mp4")) ){
				return listaDeMidias.get(i);
			}
		}
		return new NullMidia();
	}
}
