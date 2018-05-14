package designPatternsGabarito;

import classesAvancadasGabarito.SiberianHusky;

public class FactoryDog {
	
	public static Dog getInstance(String criterio){
		if(criterio.equals(Poodle.CRITERIO)){
			return new Poodle();
		}
		if(criterio.equals(RottWeiler.CRITERIO)){
			return new RottWeiler();
		}
		if(criterio.equals(SiberianHusky.CRITERIO)){
			return new SiberianHusky();
		}
		return null;
	}

}
