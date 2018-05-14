package exceptionGabarito;

public class GeraException extends Exception {
	private static final long serialVersionUID = 5828609417085304550L;
	public GeraException(String message) {
		System.out.println(message);
	}
	
	public GeraException() {
	}
	public void disparaExcecao()throws GeraException{
		throw new GeraException("Exce??o ocorrida em sistema, por favor contacte o administrador.");
	}
	public static void main(String[] args) {
		GeraException geraException = new GeraException();
		try {
			geraException.disparaExcecao();
		} catch (GeraException e) {
			e.printStackTrace();
			System.out.println("Exce??o da classe Gera Exception tratada com sucesso!"+e.getMessage());
		}

	}
}
