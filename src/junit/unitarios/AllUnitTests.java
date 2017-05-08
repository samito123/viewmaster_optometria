package junit.unitarios;

import junit.unitarios.classes.DateTest;
import junit.unitarios.classes.Md5Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Md5Test.class, DateTest.class })
public class AllUnitTests {

}
