package classesInterfaces;

import java.util.Date;

public class ReceitaBolo {

	private double cenoura;
	private double chocolate;
	private double banana;
	private double limao;
	private double leite;
	private double lo;
	private long tempoPreparo;
	private double tempoBatedeira;
	private Date horaInicioPreparo;
	private Date horaFimPreparo;
	private double farinhaTrigo;
	private int ovo;
	private double fermento;
	private int margarina;
	private int manteiga;
	private int cereja;
	private double oleo;
	private double acucar;
	private int temperaturaForno;
	private double gelatina;
	private double chaAmidoMilho;
	private double leiteCondensado;

	/**
	 * Um bolo padrão normalmente tem
	 */
	public ReceitaBolo() {

		this.ovo = 3;
		this.acucar = 2;
		this.farinhaTrigo = 3;
		this.fermento = 1;

	}

	/**
	 * Para fazer a TORTA DE LIMÃO DA REGINA, é obrigatório a utilização desses
	 * Ingredientes
	 * 
	 * MASSA:
	 * 
	 * 1 xícara de trigo 1 ovo batido 1 colher de sopa de açucar 1 colher de sopa de
	 * fermento em pó 100 g margarina RECHEIO:
	 * 
	 * 2 latas de leite condensado Suco de 7 limões 1 colher de chá de amido de
	 * milho Raspas de limão 1/2 pacotinho de gelatina sem sabor dissolvido em
	 * banho-maria COBERTURA:
	 * 
	 * 4 claras batidas em neve 4 colheres de açúcar
	 * 
	 * 
	 * @param limao
	 * @param farinhaTrigo
	 * @param ovo
	 * @param fermento
	 * @param margarina
	 * @param acucar
	 * @param temperaturaForno
	 * @param gelatina
	 * @param chaAmidoMilho
	 * @param leiteCondensado
	 */
	public ReceitaBolo(double limao, double farinhaTrigo, int ovo, double fermento, int margarina, double acucar,
			int temperaturaForno, double gelatina, double chaAmidoMilho, double leiteCondensado) {
		this.limao = limao;
		this.farinhaTrigo = farinhaTrigo;
		this.ovo = ovo;
		this.fermento = fermento;
		this.margarina = margarina;
		this.acucar = acucar;
		this.temperaturaForno = temperaturaForno;
		this.gelatina = gelatina;
		this.chaAmidoMilho = chaAmidoMilho;
		this.leiteCondensado = leiteCondensado;
	}

	/**
	 * INGREDIENTES
	 * 
	 * 2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 4 colheres
	 * (sopa) de margarina 3 ovos 1 e 1/2 xícara (chá) de leite 1 colher (sopa) bem
	 * cheia de fermento em pó
	 * 
	 * MODO DE PREPARO Bata as claras em neve e reserve Misture as gemas, a
	 * margarina e o açúcar até obter uma massa homogênea Acrescente o leite e a
	 * farinha de trigo aos poucos, sem parar de bater Por último, adicione as
	 * claras em neve e o fermento Despeje a massa em uma forma grande de furo
	 * central untada e enfarinhada Asse em forno médio 180 °C, preaquecido, por
	 * aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo
	 */
	public void prepararBoloSimples() {

	}

	/**
	 * INGREDIENTES 6 ovos 6 colheres de sopa de açúcar 5 colheres de sopa de
	 * farinha de trigo uma colher de sopa rasa de fermento em pó
	 * 
	 * MODO DE PREPARO Separar as claras das gemas Bater as claras até ficar em
	 * ponto de suspiro, acrescentar uma a uma as gemas, batendo sempre, ainda com a
	 * batedeira ligada acrescentar aos poucos o açúcar peneirado Peneirar muito bem
	 * a farinha Acrescentar à massa com a batedeira desligada, aos poucos,
	 * delicadamente, fazendo movimentos de baixo para cima Por último, acrescentar
	 * o fermento Assar em forno médio
	 */
	public void prepararPaoDeLo() {

	}

	/**
	 * NGREDIENTES 200 g de manteiga, sem sal 1 xícara (chá) de açúcar 1 lata de
	 * creme de leite 1 pacote de bolacha, maisena leite, o quanto baste, para
	 * molhar a bolacha 1 lata de leite condensado, sabor chocolate (ou cobertura de
	 * sorvete)
	 * 
	 * MODO DE PREPARO Coloque a manteiga e o açúcar na batedeira e bata até obter
	 * um creme bem fofo e liso Acrescente o creme de leite e bata rapidamente
	 * apenas para misturar Desligue a batedeira e reserve Separe um recipiente
	 * médio para montar o doce Acrescente um pouco de leite num prato fundo e molhe
	 * rapidamente algumas bolachas maisena no leite Forre o fundo do recipiente
	 * escolhido com uma camada de bolachas Acrescente uma camada do creme reservado
	 * sobre as bolachas Acrescente mais uma camada de bolachas molhadas no leite e
	 * repita o procedimento finalizando com a bolacha Cubra a última camada de
	 * bolachas com o leite condensado sabor chocolate (comprado pronto ou a
	 * cobertura) Leve à geladeira por no mínimo 3 horas ou até que o doce fique bem
	 * gelado Retire o doce da geladeira e sirva a seguir
	 * 
	 */
	public void prepararTortaAlema() {

	}

	/**
	 * MASSA:
	 * 
	 * 4 ovos 2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 1 copo
	 * (americano) de suco de laranja 1 colher (sopa) de fermento em pó
	 * 
	 * COBERTURA:
	 * 
	 * 1 garrafa pequena de leite de coco 1 garrafa de leite (utilize a mesma
	 * garrafa do leite de coco como medida) 1 lata de leite condensado 1 pacote de
	 * coco ralado sem açúcar
	 * 
	 * MASSA:
	 * 
	 * Em uma batedeira, bata as claras em neve acrescentando o açúcar aos poucos e
	 * bata por 3 minutos Adicione as gemas, o trigo, o suco e continue batendo até
	 * formar uma massa homogênea Por último, adicione o fermento e bata por mais 40
	 * segundos na menor velocidade da batedeira Despeje a massa em uma forma média
	 * e untada Asse em forno preaquecido em temperatura média de 180 °C por 40
	 * minutos ou até dourar
	 * 
	 * COBERTURA:
	 * 
	 * Em uma tigela, misture o leite de coco, o leite, o leite condensado e reserve
	 * Após 40 minutos, retire o bolo do forno e fure toda a sua superfície com um
	 * garfo para facilitar a penetração da cobertura Com o bolo ainda quente,
	 * despeje a cobertura sobre ele e salpique por cima o coco ralado Leve a
	 * geladeira por 3 horas, depois corte o bolo em quadrados do tamanho que
	 * preferir e embrulhe com papel alumínio Conserve na geladeira
	 * 
	 * 
	 * 
	 */
	public void prepararBoloGelado() {

	}

	/**
	 * MASSA: 1/2 xícara (chá) de óleo 3 cenouras médias raladas 4 ovos 2 xícaras
	 * (chá) de açúcar 2 e 1/2 xícaras (chá) de farinha de trigo 1 colher (sopa) de
	 * fermento em pó
	 * 
	 * COBERTURA:
	 * 
	 * 1 colher (sopa) de manteiga 3 colheres (sopa) de chocolate em pó 1 xícara
	 * (chá) de açúcar
	 * 
	 * Em um liquidificador, adicione a cenoura, os ovos e o óleo, depois misture
	 * Acrescente o açúcar e bata novamente por 5 minutos Em uma tigela ou na
	 * batedeira, adicione a farinha de trigo e depois misture novamente Acrescente
	 * o fermento e misture lentamente com uma colher Asse em um forno preaquecido a
	 * 180° C por aproximadamente 40 minutos
	 */
	public void prepararBoloDeCenoura() {
		this.oleo = 0.5;
		this.cenoura = 3.0;// raladas
		this.ovo = 4;
		this.acucar = 2;
		this.farinhaTrigo = 0.5;
		this.fermento = 1;
		// Fazer Cobertura
		this.manteiga = 1;
		this.chocolate = 3;
		this.acucar = 1;
		this.tempoBatedeira = 60 * 5;// segundos
		this.temperaturaForno = 180;
		this.tempoPreparo = 60 * 40;
		this.horaInicioPreparo = new Date();
		this.horaFimPreparo = new Date(this.horaInicioPreparo.getTime() + this.tempoPreparo);

	}

	public double getCenoura() {
		return cenoura;
	}

	public void setCenoura(double cenoura) {
		this.cenoura = cenoura;
	}

	public double getChocolate() {
		return chocolate;
	}

	public void setChocolate(double chocolate) {
		this.chocolate = chocolate;
	}

	public double getBanana() {
		return banana;
	}

	public void setBanana(double banana) {
		this.banana = banana;
	}

	public double getLimao() {
		return limao;
	}

	public void setLimao(double limao) {
		this.limao = limao;
	}

	public double getLeite() {
		return leite;
	}

	public void setLeite(double leite) {
		this.leite = leite;
	}

	public double getLo() {
		return lo;
	}

	public void setLo(double lo) {
		this.lo = lo;
	}

	public long getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(long tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public double getTempoBatedeira() {
		return tempoBatedeira;
	}

	public void setTempoBatedeira(double tempoBatedeira) {
		this.tempoBatedeira = tempoBatedeira;
	}

	public Date getHoraInicioPreparo() {
		return horaInicioPreparo;
	}

	public void setHoraInicioPreparo(Date horaInicioPreparo) {
		this.horaInicioPreparo = horaInicioPreparo;
	}

	public Date getHoraFimPreparo() {
		return horaFimPreparo;
	}

	public void setHoraFimPreparo(Date horaFimPreparo) {
		this.horaFimPreparo = horaFimPreparo;
	}

	public double getFarinhaTrigo() {
		return farinhaTrigo;
	}

	public void setFarinhaTrigo(double farinhaTrigo) {
		this.farinhaTrigo = farinhaTrigo;
	}

	public int getOvo() {
		return ovo;
	}

	public void setOvo(int ovo) {
		this.ovo = ovo;
	}

	public double getFermento() {
		return fermento;
	}

	public void setFermento(double fermento) {
		this.fermento = fermento;
	}

	public int getMargarina() {
		return margarina;
	}

	public void setMargarina(int margarina) {
		this.margarina = margarina;
	}

	public int getManteiga() {
		return manteiga;
	}

	public void setManteiga(int manteiga) {
		this.manteiga = manteiga;
	}

	public int getCereja() {
		return cereja;
	}

	public void setCereja(int cereja) {
		this.cereja = cereja;
	}

	public double getOleo() {
		return oleo;
	}

	public void setOleo(double oleo) {
		this.oleo = oleo;
	}

	public double getAcucar() {
		return acucar;
	}

	public void setAcucar(double acucar) {
		this.acucar = acucar;
	}

	public int getTemperaturaForno() {
		return temperaturaForno;
	}

	public void setTemperaturaForno(int temperaturaForno) {
		this.temperaturaForno = temperaturaForno;
	}

	public double getGelatina() {
		return gelatina;
	}

	public void setGelatina(double gelatina) {
		this.gelatina = gelatina;
	}

	public double getChaAmidoMilho() {
		return chaAmidoMilho;
	}

	public void setChaAmidoMilho(double chaAmidoMilho) {
		this.chaAmidoMilho = chaAmidoMilho;
	}

	public double getLeiteCondensado() {
		return leiteCondensado;
	}

	public void setLeiteCondensado(double leiteCondensado) {
		this.leiteCondensado = leiteCondensado;
	}
	
	
}
