package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is begining of tests..");
    }
    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #\"" + testCounter);
    }
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith",
                "Hello everyone, this is my first contribution here!");

        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());
    }

}
