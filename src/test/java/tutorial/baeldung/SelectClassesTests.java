package tutorial.baeldung;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ AGuideToJUnit5.class })
public class SelectClassesTests {
}
