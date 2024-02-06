package org.example.logic;

import org.junit.jupiter.api.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class AddTest {

    public Add add;
    @BeforeEach
    void beforeEachTest (){
        System.out.println("@BeforeEach Test");
        add = new Add();
    }

    @AfterEach
    void afterEachTest (){
        System.out.println("@AfterEach Test");
    }

    @BeforeAll
    static void beforeAllTest (){
        System.out.println("@BeforeAll method executes before all test case");
    }

    @AfterAll
    static void afterAllTest (){
        System.out.println("@AfterAll method executes after all test case executed");
    }

    @Test
//    @DisplayName("Teasting addition ()")
    void test_Equals_Not_Equals (){
        System.out.println("Inside testEqualsNotEquals");
        int expected =6;
        Assertions.assertEquals(expected, add.addition(3,3), "addition of 3 + 3 should be 6");
        Assertions.assertNotEquals(8, add.addition(5,4), "the addition of 4+4 should not be 8");
    }

    @Test
//    @DisplayName("Testing null and not null")
    void testNullOrNotNull (){
        System.out.println("testNullOrNotNull");
//        Add add = new Add();
        Assertions.assertNull(add.checkNull());
//        Assertions.assertNotNull(add.checkNull(), "Should not be null");
    }

}
