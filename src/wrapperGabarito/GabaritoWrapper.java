package wrapperGabarito;

public class GabaritoWrapper {
	public static void main(String[] args) {
		String str="777.77";
		System.out.println("Cast for Double:"+Double.parseDouble(str));
		System.out.println("Cast for Float:"+Float.parseFloat(str));
		String truth="true";
		Boolean verdade = new Boolean(truth);
		System.out.println(verdade.toString());
	}
}
