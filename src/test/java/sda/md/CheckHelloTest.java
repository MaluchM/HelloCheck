package sda.md;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CheckHelloTest {

    @Test
    public void testWhenEmptyReturnZero() {

        String input = "";
        int result = new CheckHello().check(input, "hello");
        assertEquals(0, result);
    }

    @Test
    public void testWhenHelloWorldReturnOne() {

        String input = "hello world";
        int result = new CheckHello().check(input, "hello");
        assertEquals(1, result);
    }

    @Test
    public void testWhenHelloWorldIsBigLetterzReturnOne() {

        String input = "Hello world";
        int result = new CheckHello().check(input, "hello");
        assertEquals(1, result);
    }

    @Test
    public void testWhenThreeHelloWorldReturnThree() {

        String input = "hello world Hello world hello";
        int result = new CheckHello().check(input, "hello");
        assertEquals(3, result);
    }

    @Test
    public void testWhenHelloWorldSplitOtherSignReturnThree() {

        String input = "hello,world/Hello.world hello";
        int result = new CheckHello().check(input, "hello");
        assertEquals(3, result);
    }


}