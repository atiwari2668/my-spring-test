package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;


public class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void createInstances (){
        System.out.println("@BeforeEach Executing");
        demoUtils = new DemoUtils();
    }
    @Test
    @DisplayName("assert same or not same")
    void assertSameOrNotSame (){
        String testStr = "myString";
        assertSame(demoUtils.getStr1(), demoUtils.getStr2(), "Both Should refer to the same object");
        assertNotSame(testStr,
                demoUtils.getStr1(),
                "both should not refer same object");
    }

    @Test
    @DisplayName("Testing assert true or false")
    void assertTrueOrFalse(){
        assertTrue(demoUtils.isAGreater(4,1), "A should be greater");
        assertFalse(demoUtils.isAGreater(2,3),"A should less then B");
    }

    @Test
    @DisplayName("Array Equals")
    void assertArrayEqualsTest (){
        String[] expect = {"banana", "orange", "apple"};
        assertArrayEquals(expect, demoUtils.getFruits(), "array should be equal");
    }

    @Test
    @DisplayName("Iterable Equals")
    void assertIterableEqualsTest (){
        List<String> expect = List.of("red", "black", "green");
        assertIterableEquals(expect, demoUtils.getColor());
    }

    @Test
    @DisplayName("Line Match")
    void assertLineMatchTest (){
        List<String> expect = List.of("red", "black", "green");
        assertLinesMatch(expect, demoUtils.getColor(), "lines should match");
    }

    @Test
    @DisplayName("Throw Excepption test")
    void assertThrowException (){
        assertThrows(
                Exception.class,
                ()->{
                demoUtils.throwException(-1);
                }, "Should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(9);}, "Should not throw exception");
    }


}
