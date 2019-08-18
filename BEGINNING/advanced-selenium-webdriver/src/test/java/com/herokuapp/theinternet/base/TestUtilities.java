package com.herokuapp.theinternet.base;

public class TestUtilities extends BaseTest {

    //STATIC SLEEP - not recommended, just for the sake of demonstrating in slow mode or debugging?
    protected static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
