import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DAOProxy extends ManipularMidiaDAOInterface{

	public DAOProxy(){
		
	}

	public void imprimirMidias(List<MidiaAbstrata> midias){
		int i = 0;
		for(i = 0; i < midias.size() ; ++i){
			System.out.println("Nome = " + midias.get(i).getNome() + "." + midias.get(i).getExtensao() + "\tTamanho = " + midias.get(i).tamanhoDoArquivo() + " mb");
		}
	}

	public MidiaAbstrata selecionarMidia(List<MidiaAbstrata> listaDeMidias, String nomeDaMidia){
		SelecionarMidia midia = null;
		int auxiliar = inputInt();
		if( auxiliar == 1 ){
			midia = new Mp3(new Mp4(new Outro(null,null), listaDeMidias), listaDeMidias);
		}

		if( auxiliar == 2 ){
			midia = new Mp4(new Outro(new Mp3(null,null), listaDeMidias), listaDeMidias);
		}

		if( auxiliar == 3 ){
			midia = new Outro(new Mp3(new Mp4(null,null), listaDeMidias), listaDeMidias);
		}
			
		return midia.selecionar(nomeDaMidia);
	}

	public static int inputInt(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}


}
