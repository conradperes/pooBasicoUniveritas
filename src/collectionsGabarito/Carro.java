package collectionsGabarito;

public class Carro implements Comparable<Carro> {
	public String marca, ano;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Carro(String marca, String ano) {
		this.marca = marca;
		this.ano = ano;
	}

	@Override
	public int compareTo(Carro o) {
		return marca.compareTo(o.getMarca());
	}
}
