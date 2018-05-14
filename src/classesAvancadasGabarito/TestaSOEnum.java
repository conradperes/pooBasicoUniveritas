package classesAvancadasGabarito;
public class TestaSOEnum {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SOEnum android = SOEnum.ANDROID;
		System.out.println(android.name());
		SOEnum hpux = SOEnum.HPUX;
		System.out.println(hpux.name());
		for (SOEnum so : SOEnum.values()) {
			System.out.println("So =" + so + " nome=" + so.name());

		}
	}

}
