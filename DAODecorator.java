import java.util.ArrayList;
import java.util.List;

public class DAODecorator extends ManipularMidiaDAOInterface{
	private static ManipularMidiaDAOInterface manipularDAO = new DAOProxy();

	public DAODecorator(InterfaceAdicionarMidia addMidia, String nome){
		this.addMidia = addMidia;
		this.nome = nome;
	}

	public DAODecorator(){
		
	}

	public void imprimirMidias(List<MidiaAbstrata> midias){
		System.out.println("\n\n\tLista de todas as midias cadastradas: ");
		manipularDAO.imprimirMidias(midias);
	}
	
	public MidiaAbstrata selecionarMidia(List<MidiaAbstrata> listaDeMidias, String nomeDaMidia){
		System.out.print("\n\n Informe o formato do arquivo que vc quer encontrar?\n\t1) mp3\n\t2) mp4\n\t3) outro\n\n>>> ");
		return manipularDAO.selecionarMidia(listaDeMidias, nomeDaMidia);
	}

	public void setAddMidia(InterfaceAdicionarMidia addMidia){
		this.addMidia = addMidia;
	}

	public InterfaceAdicionarMidia getAddMidia(){
		return this.addMidia;
	} 

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}
}
