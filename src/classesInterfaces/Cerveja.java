package classesInterfaces;
public class Cerveja {
	private double litros;
	private String estilo;
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public void consumoCerveja(double litros) {
		this.litros-=litros;
	}

	@Override
	public String toString() {
		return "Cerveja [litros=" + litros + ", estilo=" + estilo + "]";
	}
}
