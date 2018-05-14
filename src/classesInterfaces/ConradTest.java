package classesInterfaces;

public class ConradTest {

	public static void main(String[] args) {
		Pessoa p = new Conrad(500000.00);
		p.pagaImpostos();
		p.comer("Fraudinha", "Saudável");
		if(p instanceof Conrad) {
			Conrad c = (Conrad)p;
			c.programar();
		}

	}

}
