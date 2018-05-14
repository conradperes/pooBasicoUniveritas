	package exceptionGabarito;
	
	public class BradescoSegurosException extends Exception {
		private static final long serialVersionUID = -7836009731299040134L;
		private int port;
	
		public BradescoSegurosException(String message) {
			System.out.println(message);
		}
	
		public int getPort() {
			return port;
		}
	
		public void geraException() throws BradescoSegurosException {
			throw new BradescoSegurosException(
					"Gerou uma exceção no sistema da Bradesco Seguros");
		}
	}
