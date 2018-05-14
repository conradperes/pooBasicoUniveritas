package classesAvancadasGabarito;

import designPatternsGabarito.UtilPrint;

public class Instituicao extends UtilPrint{
	private double nota = 10;
	public static void main(String[] args) {
		Instituicao instituicao = new Instituicao();
		Aluno aluno = instituicao.new Aluno();
		aluno.verNota();
	}
	
	public class Aluno {
		public void verNota() {
			log(nota);
			log(this);
			log(Instituicao.this);
		}
	}
}
