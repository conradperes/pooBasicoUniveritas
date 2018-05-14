package nio2Gabarito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileLegadoGabarito {
	static String PREFIXO_DIR = "/Users/conradmarquesperes/";
	static File dir;

	public static File getDir() {
		return dir;
	}

	public static void setDir(File directory) {
		dir = directory;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String nomeDir = leTeclado("diretorio");
			criarDiretorio(PREFIXO_DIR.concat(nomeDir));
			String nomeArq = leTeclado("nome");
			if (criarArquivo(nomeArq)) {
				System.out.println("criou arquivo");
				escreverArquivo(nomeDir + "/" + nomeArq);
				lerConteudoDiretorio();
			} else
				System.out.println("N�o foi poss�vel crir arquivo!");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static String leTeclado(String nome) throws Exception {
		String s = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Unix: Digite ctrl-d ou ctrl-c para sair"
				+ "\n windows ctrl-c para sair");
		System.out.println("Digite " + nome + " do arquivo=");
		s = scan.next();
		System.out.println("Lendo=" + s);
		return s;
	}

	private static String leTeclado() throws Exception {
		String s = null;
		Scanner scan = new Scanner(System.in);
		s = scan.next();
		System.out.println("Lendo=" + s);
		return s;
	}

	public static boolean criarArquivo(String nomeArq) throws IOException {
		File arquivo = new File(nomeArq);
		boolean criouArquivo = arquivo.createNewFile();
		return criouArquivo;

	}

	public static boolean criarDiretorio(String nomeArq) {
		File dir = new File(nomeArq);
		setDir(dir);
		if (!dir.exists()) {
			dir.mkdir();
		} else
			System.out.println("N�o criou o diret�rio pois j� existia!");
		return false;

	}

	public static void lerConteudoDiretorio() {
		File dir = getDir();
		if (dir.isDirectory()) {
			String dirContents[] = dir.list();
			for (int i = 0; i < dirContents.length; i++) {
				System.out.println(dirContents[i]);
			}
		}

	}

	public static void capturarCaminhoAbsolutoDir(String nomeArq) {
		File dir = getDir();
		System.out.println(dir.getAbsolutePath());

	}

	public static void LerArquivo(String nomeArq) throws IOException {
		File dir = getDir();
		File caminhoCompleto = new File(dir.toString() + "/" + nomeArq);
		BufferedReader reader = new BufferedReader(new FileReader(
				caminhoCompleto));
		String s;
		s = reader.readLine();
		while (s != null) {
			System.out.println("Lendo arquivo=" + s);
			s = reader.readLine();
		}
		reader.close();
	}

	public static void escreverArquivo(String nomeArq) throws Exception {
		File f = new File(nomeArq);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter(f));
		String s;
		System.out.println("Digite texto ao ser inserido no arquivo");
		s = leTeclado();
		System.out
				.println("Se quiser digitar algo mais tecle y, caso contrario n");
		String option = leTeclado();
		if (option.equalsIgnoreCase("y")) {
			s = leTeclado();
		}
		out.println(s);
		in.close();
		out.close();

	}
}
