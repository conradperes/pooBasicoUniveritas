package collectionsGabarito;

public class Pessoa {
	String nome;
	Integer idade;
	String endereco;

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public Pessoa(String nome, Integer idade, String endereco) {
		this.nome = nome;
		this.idade=idade;
		this.endereco=endereco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String toString() {
		return nome + idade + endereco;
	}

}
