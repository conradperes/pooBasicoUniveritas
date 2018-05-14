package junitGabarito;

import javax.swing.JOptionPane;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FrameworkTest {
	@Test
    public void verificacaoNumero() {
		String a = JOptionPane.showInputDialog(null, "Digite um numero entre 0 e 20");
		int numero = new Integer(a);
		assert(numero >=0 && numero <=20) : "numero incorreto="+numero;
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    	System.out.println("x");
    }

}
