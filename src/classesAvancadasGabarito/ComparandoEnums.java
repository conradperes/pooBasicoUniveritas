package classesAvancadasGabarito;

public class ComparandoEnums {

	public static void comparaEnum(OpcoesMenu opcao){
        if(opcao.equals(OpcoesMenu.DEBUGAR)){
            System.out.println("Foi escolhido a opção Debugar");
        }else if(opcao.equals(OpcoesMenu.ABRIR)){
            System.out.println("Foi escolhido a opção ABRIR");
        }else if(opcao.equals(OpcoesMenu.FECHAR)){
            System.out.println("Foi escolhido a opção FECHAR");
        }
    }
     
    public static void main(String[] args) {
        comparaEnum(OpcoesMenu.DEBUGAR);
    }
}
