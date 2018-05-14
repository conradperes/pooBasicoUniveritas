package nio2Gabarito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeituraEscritaArquivosJava7 {

	/*public static void main(String... aArgs) throws IOException {
		LeituraEscritaArquivosJava7 text = new LeituraEscritaArquivosJava7();

		// treat as a small file
		List<String> lines = text.readSmallTextFile(FILE_NAME);
		log(lines);
		lines.add("This is a line added in code.");
		text.writeSmallTextFile(lines, FILE_NAME);

		// treat as a large file - use some buffering
		text.readLargerTextFile(FILE_NAME);
		lines = Arrays.asList("Down to the Waterline", "Water of Love");
		text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);
	}*/

	final static String FILE_NAME = "Documentos\\PRODUTOS.odt";
	final static String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;

	// For smaller files

	List<String> readSmallTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		return Files.readAllLines(path, ENCODING);
	}

	public static void writeSmallTextFile(List<String> aLines, String aFileName)
			throws IOException {
		Path path = Paths.get(aFileName);
		Path write = Files.write(path, aLines, ENCODING);
		log(write.getFileName());
	}

	// For larger files

	void readLargerTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		try (Scanner scanner = new Scanner(path, ENCODING.name())) {
			while (scanner.hasNextLine()) {
				// process each line in some way
				log(scanner.nextLine());
			}
		}
	}

	void readLargerTextFileAlternate(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				// process each line in some way
				log(line);
			}
		}
	}

	static void writeLargerTextFile(String aFileName, List<String> aLines)
			throws IOException {
		Path path = Paths.get(aFileName);
		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {
			for (String line : aLines) {
				writer.write(line);
				writer.newLine();
			}
		}
	}
	
	public static void main(String[] args) {
		List <String>linhas= new ArrayList<String>();
		linhas.add("ARTE DA GUERRA");
		try {
			LeituraEscritaArquivosJava7.writeLargerTextFile(FILE_NAME,linhas );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void log(Object aMsg) {
		System.out.println(String.valueOf(aMsg));
	}

	public List<String> getFileLines(String nomeArquivoProduto)
			throws IOException {
		List<String> listaFiles = new ArrayList<String>();
		Path path = Paths.get(nomeArquivoProduto);
		try (Scanner scanner = new Scanner(path, ENCODING.name())) {
			while (scanner.hasNextLine()) {
				// process each line in some way
				listaFiles.add(scanner.nextLine());
			}
		}
		return listaFiles;
	}

}
