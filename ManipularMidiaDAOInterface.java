import java.util.ArrayList;
import java.util.List;

public abstract class ManipularMidiaDAOInterface{

	protected InterfaceAdicionarMidia addMidia;
	protected String nome;

	public abstract void imprimirMidias(List<MidiaAbstrata> midias);
	
	public abstract MidiaAbstrata selecionarMidia(List<MidiaAbstrata> listaDeMidias, String nomeDaMidia);

}