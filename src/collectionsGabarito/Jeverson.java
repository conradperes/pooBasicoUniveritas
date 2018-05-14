package collectionsGabarito;

public class Jeverson {
	
	int idade;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
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
		Jeverson other = (Jeverson) obj;
		if (idade != other.idade)
			return false;
		return true;
	}

	public String toString() {
		return "A idade do Jeverson é "+idade;
	}

	public static void main(String[] args) {
		Jeverson j = new Jeverson(25);
		System.out.println(j);
	}



	public Jeverson(int idade) {
		super();
		this.idade = idade;
	}

}
