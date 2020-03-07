package main;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import main.*;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Junit Tests")
@SelectPackages("main")
public class AllTests {

}
