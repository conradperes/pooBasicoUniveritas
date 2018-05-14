package junitGabarito;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FrameworkTest.class, TestaHerancaTest.class, TransferenciaTest.class})
public class AllTests {

}
