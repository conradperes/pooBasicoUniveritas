package classesAvancadasGabarito;

public class CorpoHumano {
	
	private int sangue=0;
	public static void main(String[] args) {
		CorpoHumano corpo = new CorpoHumano();
		corpo.bombeaSangue();
	}
	public void bombeaSangue(){
		log("sangue antes "+sangue);
		Orgaos orgaos = new Orgaos();
		orgaos.pulmaoRespirando();
	}
	public void log(Object obj){
		System.out.println(obj);
	}
	class Orgaos {
		public void pulmaoRespirando() {
			System.out.println("Pulmao trabalhando");
			sangue++;
			log("sangue depois="+sangue);
		}
	}
}
