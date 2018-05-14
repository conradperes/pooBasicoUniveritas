package estruturaClasse;//Representação lógica de classes com o mesmo propósito no mesmo compartimento

public class Mochila {
	/**
	 * Atributos da classe mochila
	 */
	private String bolsoOculos;
	private String alca1;
	private String alca2;
	private String ziper1, ziper2, ziper3;
	private String bolsoLateral1, bolsoLateral2;
	private String recipientePequeno;
	private String recipienteNotebook;
	/**
	 * Construtor que contém todos os atributos da classe Mochila
	 * Serve para construir ou instanciar o objeto da classe Mochila
	 * @param bolsoOculos
	 * @param alca1
	 * @param alca2
	 * @param ziper1
	 * @param ziper2
	 * @param ziper3
	 * @param bolsoLateral1
	 * @param bolsoLateral2
	 * @param recipientePequeno
	 * @param recipienteNotebook
	 */
	public Mochila(String bolsoOculos, String alca1, String alca2, String ziper1, String ziper2, String ziper3,
			String bolsoLateral1, String bolsoLateral2, String recipientePequeno, String recipienteNotebook) {
		super();
		this.bolsoOculos = bolsoOculos;
		this.alca1 = alca1;
		this.alca2 = alca2;
		this.ziper1 = ziper1;
		this.ziper2 = ziper2;
		this.ziper3 = ziper3;
		this.bolsoLateral1 = bolsoLateral1;
		this.bolsoLateral2 = bolsoLateral2;
		this.recipientePequeno = recipientePequeno;
		this.recipienteNotebook = recipienteNotebook;
	}
	/**
	 * Método main que diz para a classe o que será invocado para a execução  da classe Mochila
	 * @param args
	 */
	public static void main(String[] args) {
		Mochila mochila = Mochila.getMochila();
		System.out.println(mochila.toString());

	}
	/**
	 * Método que retorna uma instância de Mochila com os valores dos atributos para ser utilizado pelo chamado da classe Mochila
	 * esse método é static, mais a frente explicaremos o que significa ser static
	 * @return
	 */
	static Mochila getMochila() {
		Mochila mochila = new Mochila("Oculos de Sol guardado!","Alca superior","Alca Inferior","Ziper Frontal","Ziper do recipiente maior",
				"Ziper do recipiente menor","Bolso do guarda chuva","Sem uso","2 mouses, carteira e fios de phone de ouvido",
				"Notebook e teclado guardado");
		return mochila;
	}

	/**
	 * Esse método transforma a instância de Mochila em uma String inteligível com o conteúdo entrado pelo usuário
	 */
	@Override
	public String toString() {
		return "Mochila [bolsoOculos=" + bolsoOculos + ", alca1=" + alca1 + ", alca2=" + alca2 + ", ziper1=" + ziper1 +"\n\t"
				+ ", ziper2=" + ziper2 + ", ziper3=" + ziper3 + ", bolsoLateral1=" + bolsoLateral1 + ", bolsoLateral2="+"\n\t"
				+ bolsoLateral2 + ", recipientePequeno=" + recipientePequeno + ", recipienteNotebook="+"\n\t"
				+ recipienteNotebook + "]";
	}
}
