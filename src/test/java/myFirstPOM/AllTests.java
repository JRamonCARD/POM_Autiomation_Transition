package myFirstPOM;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginPage_TEST.class, ProductPage_TEST.class, AccoutPage_TEST.class})
public class AllTests {

}
