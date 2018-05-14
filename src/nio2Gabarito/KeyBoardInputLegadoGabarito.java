package nio2Gabarito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInputLegadoGabarito {

	public static void main(String[] args)  {

		try {
			leTeclado();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void leTeclado() throws Exception {
		String s;
		InputStreamReader ir=null;
		try {
		    ir = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(ir);
			System.out.println("Unix: Digite ctrl-d ou ctrl-c para sair" +
					"\n windows ctrl-c para sair");
			s=in.readLine();
			while (s!=null) {
				System.out.println("Lendo="+s);
				s = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			ir.close();
		}
	}

}
