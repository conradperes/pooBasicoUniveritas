package collectionsGabarito;

import java.util.HashSet;
import java.util.Set;

public class SetFloatExample {
	String nome;
	
	
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
		SetFloatExample other = (SetFloatExample) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public static void main(String[] args) {
		Set numerosFloat = new HashSet();
		numerosFloat.add(4.5f);
		numerosFloat.add(4.5f);
		numerosFloat.add(4.5f);
		numerosFloat.add(1.5f);
		numerosFloat.add(2.5f);
		numerosFloat.add(3.5f);
		numerosFloat.add(6.5f);
		numerosFloat.add(7.5f);
		numerosFloat.add(4.5f);
		numerosFloat.add(9.5f);
		numerosFloat.add(10.5f);
		numerosFloat.add(4.5f);
		numerosFloat.add(11.5f);
		numerosFloat.add(4.5f);
		System.out.println(numerosFloat);
	}
	
	

}
