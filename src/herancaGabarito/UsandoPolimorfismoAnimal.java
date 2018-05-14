package herancaGabarito;

import javax.swing.JOptionPane;

public class UsandoPolimorfismoAnimal {

	public static void main(String[] args) {

		escolhaAnimal();	
		
		
	}

	public static int escolhaAnimal() {
		Animal animal = null;
		String opcao=JOptionPane.showInputDialog("Qual animal ir?? comer?\n" +
				"1-Cachorro\n" +
				"2-Macaco");
		if(opcao.equals("1")){ 
			animal = new Cachorro();
		}else if(opcao.equals("2")){
			animal = new Macaco();
		}else{
			JOptionPane.showMessageDialog(null,"Animal Desconhecido");
		}
			animal.comer();
			return new Integer(opcao);
	}

}
