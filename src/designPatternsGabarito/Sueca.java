package designPatternsGabarito;

public class Sueca extends Jogo {
	
	public static final String TIPO="SUECA";
	
	UtilPrint print = new UtilPrint();
	public void jogouUmAs(){
		print.log("Maior carta na mesa");
	}
	public void usandoTrunfo(){
		print.log("Jogador fez uso de trunfos");
	}
	public void ganhandoMao(){
		print.log("Jogador ganhou a mao");
	}
	 
	public void ganhouJogo(){
		print.log("Recebido trof??u!!!");
	}

}
