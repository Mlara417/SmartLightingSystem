package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ createRoomTest.class, getIteratorTest.class, getNameTest.class, hasNextTest.class, nextTest.class,
		offButtonWasPushedTest.class, onButtonWasPushedTest.class, setCommandTest.class, setStateTest.class })
public class AllTests {

}
