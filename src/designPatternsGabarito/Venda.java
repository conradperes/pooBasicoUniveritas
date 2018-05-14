package designPatternsGabarito;

import javax.swing.JOptionPane;

public class Venda {
	private double valorVenda;
    private Funcionario funcionario;
    private Strategy calculoComissao;

    // Construtor [Implementa STRATEGY].
    public Venda() {
    	String tipoFuncionario = JOptionPane.showInputDialog(null,
				"Selecione o Funcionario ATENDENTE VENDEDOR GERENTE");
		funcionario = new Funcionario();
        switch (funcionario.getCargo(tipoFuncionario)) {

            case 1 :

                this.setCalculoComissao(new Strategy() {

                    @Override
                    public double calcularComissao(double valorVenda) {
                    	valorVenda=500;
                        return (valorVenda * 0.01);                            
                    }
                });
                break;

            case 2 :

                this.setCalculoComissao(new Strategy() {

                    @Override
                    public double calcularComissao(double valorVenda) {
                    	valorVenda=1000;
                        return (valorVenda * 0.02);                            
                    }
                });
                break;

            case 3 :

                this.setCalculoComissao(new Strategy() {

                    @Override
                    public double calcularComissao(double valorVenda) {
                    	valorVenda=2000;
                        return (valorVenda * 0.03);                            
                    }
                });
                break;
        }
    }

    private void setCalculoComissao(Strategy calculoComissao) {
        this.calculoComissao= calculoComissao;
    }

    private Strategy getCalculoComissao() {
        return (this.calculoComissao);
    }

    public void save() {

        //. . .

        /* 
         * Calcula o valor da comiss??o de venda sem que haja a necessidade de
         * verificar qual o tipo cargo toda vez que o metodo <b>save</b> for executado. 
         */
        final double valorComissao = this.getCalculoComissao().calcularComissao(this.valorVenda);
        UtilPrint print = new UtilPrint();
        print.log("valorComissao="+valorComissao);
        // . . .
    }
    
    public static void main(String[] args) {
		new Venda().save();
	}
}

