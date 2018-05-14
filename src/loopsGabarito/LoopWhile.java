package loopsGabarito;

public class LoopWhile {
	public static void main(String[] args) {
		int idade=0;
		while(idade<18){
			System.out.printf("Ainda não pode dirigir garoto!  %d",idade);
			System.out.println("\n");
			idade++;
		}
		System.out.println("agora já pode :-)");
	}
}

