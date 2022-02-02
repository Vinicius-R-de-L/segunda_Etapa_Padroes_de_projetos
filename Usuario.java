public class Usuario{
	private String nome;
	private String endereco;
	private String idade;
	private static Usuario usuario;

	private Usuario(String nome){// construtor 1
		this.nome = nome;
		this.endereco = "Endereco Nulo";
		this.idade = "00/00/0000";
	}

	private Usuario(String nome, String endereco){// construtor 2
		this.nome = nome;
		this.endereco = endereco;
		this.idade = "00/00/0000";
	}

	private Usuario(String nome, String endereco, String idade){// construtor 3
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}

	public Usuario(){// construtor 4
		this.nome = "Desconhecido";
		this.endereco = "Endereco Nulo";
		this.idade = "00/00/0000";
	}

	public static Usuario criar_Nome(String nome) {
		if (usuario != null) {
			usuario.setNome(nome);
			return usuario;
		}

		if (!valida(nome))
			return null;
		return new Usuario(nome);
	}

	public static Usuario criar_Nome_e_Endereco(String nome, String endereco) {
		if (usuario != null) {
			usuario.setNome(nome);
			usuario.setEndereco(endereco);
			return usuario;
		}

		if (!valida(nome))
			return null;
		if (!valida(endereco))
			return null;
		return new Usuario(nome, endereco);
	}

	public static Usuario criar_Nome_e_Idade(String nome, String idade) {
		if (usuario != null) {
			usuario.setNome(nome);
			usuario.setIdade(idade);
			return usuario;
		}

		if (!valida(nome))
			return null;
		if (!valida(idade))
			return null;
		Usuario x = new Usuario(nome);
		x.setIdade(idade);
		return x;
	}

	public static Usuario criar(String nome, String endereco, String idade) {
		if (usuario != null) {
			usuario.setNome(nome);
			usuario.setEndereco(endereco);
			usuario.setIdade(idade);
			return usuario;
		}

		if (!valida(nome))
			return null;
		if (!valida(endereco))
			return null;
		if (!valida(idade))
			return null;
		return new Usuario(nome, endereco, idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!valida(nome))
			return;
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (!valida(endereco))
			return;
		this.endereco = endereco;
	}

	public void setIdade(String idade) {
		if (!valida(idade))
			return;
		this.idade = idade;
	}

	private static boolean valida(String texto) {
		return !texto.contains(" ");
	}

	@Override
	public String toString(){
		return "\n\n\tNome = " + this.nome + " Endereco = " + this.endereco + " Idade = " + this.idade;
	}
}