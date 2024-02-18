package org.example.logic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {

    @Test
    @Disabled("wait until jira 123 will not complete")
    void disabledTest(){
        // wait until jira 123 wiil notcomplete
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowOnly (){
        //Test should run on windows only
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){
        // test will run on only mac
    }

    @Test
    @EnabledOnOs({OS.WINDOWS,OS.MAC})
    void testForMacAndWindowBoth (){
        // test for mac and window both
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){
        // test only for linux only
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testForJre13(){
        // test run only on jre 13
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max = JRE.JAVA_17)
    void enabledOnJreRange8To17(){
        //test runs between jre 8-17
    }

    @Test
    @EnabledIfSystemProperty(named="MY_PROP", matches="PROP_TEST")
    void enabledIfSystemPropertyMatched(){
        // test will run only when then system property is MYProp avaiable
    }

    @Test
    @EnabledIfEnvironmentVariable(named="MY_ENV", matches="DEV")
    void enabledIfEnvironmentVariableMatched(){
        // test will run if environment variable will matched
    }


}
