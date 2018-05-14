package classesAvancadasGabarito;

public class TestaOpcoesMenuEnum {

	public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao == OpcoesMenu.SALVAR){
            System.out.println("Salvando o arquivo!");
        }
        else if(opcao == OpcoesMenu.DEBUGAR){
            System.out.println("Dubugando classe java!!!!!");
        }
    }
 
    public static void main(String[] args) {
        escolheOpcao(OpcoesMenu.DEBUGAR);
    }
}
