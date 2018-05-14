package junitGabarito;

import org.junit.Test;

import herancaGabarito.UsandoPolimorfismoAnimal;

public class TestaHerancaTest {

	@Test
	public void testMain() {
		int opcao = UsandoPolimorfismoAnimal.escolhaAnimal();
		assert( opcao==1 || opcao == 2) : "teste falhou pois escolheu animal inexistente";
	}

}
