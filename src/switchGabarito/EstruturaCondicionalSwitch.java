package switchGabarito;

public class EstruturaCondicionalSwitch {
	final static int DELUXE = 1;
	final static int STANDARD = 2;
	final static int THE_WORKS = 3;

	public static void addWheels() {
		System.out.println("Adding wheels");
	}

	public static void addEngine() {
		System.out.println("Adding Engine");
	}

	public static void addRadio() {
		System.out.println("Adding RADIO");
	}

	public static void addAirConditionating() {
		System.out.println("Adding Air Conditionating");
	}

	public static void addGoldPackage() {
		System.out.println("Adding gold Package");
	}
	public static void add7WayAdjustableSeats() {
		System.out.println("Adding seats");
	}
	public static void chooseCarModel(int carModel) {
		switch (carModel) {
		case THE_WORKS:
			add7WayAdjustableSeats();
			addGoldPackage();
			break;
		case DELUXE:
			addAirConditionating();
			addRadio();
			addWheels();
			addEngine();
			break;
		case STANDARD:
			addRadio();
			addWheels();
			addEngine();
			break;
		default:
			addWheels();
			addEngine();
			break;
		}
	}

	public static void main(String[] args) {
		// Escolhendo tipo DELUXE!
		chooseCarModel(DELUXE);

	}

}
