package switchGabarito;

public class ModeloCasaSwitch {
	final static int MULTIMILHONARIA = 1;
	final static int SIMPLES = 2;
	final static int RICA = 3;

	public static void addSauna() {
		System.out.println("Adding Sauna");
	}

	public static void addHidroMassagem() {
		System.out.println("Adding Hidro");
	}

	public static void addTresQuartos() {
		System.out.println("Adding 3 quartos");
	}

	public static void addPiscina() {
		System.out.println("Adding Pool");
	}

	public static void addGoldPackage() {
		System.out.println("Adding gold Package");
	}
	public static void addCascataNaPiscina() {
		System.out.println("Adding Cascata Na Piscina");
	}
	public static void chooseHouseModel(int houseModel) {
		switch (houseModel) {
		case RICA:
			addCascataNaPiscina();
			break;
		case MULTIMILHONARIA:
			addPiscina();
			addSauna();
			addHidroMassagem();
			addGoldPackage();
			break;
		case SIMPLES:
			addTresQuartos();
			break;
		default:
			addTresQuartos();
			break;
		}
	}

	public static void main(String[] args) {
		// Escolhendo tipo DELUXE!
		chooseHouseModel(MULTIMILHONARIA);

	}

}
