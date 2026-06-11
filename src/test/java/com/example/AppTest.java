package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for App class
 */
public class AppTest {
    
    @Test
    public void testGreet() {
        String result = App.greet("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testGreetDifferentName() {
        String result = App.greet("Maven");
        assertEquals("Hello, Maven!", result);
    }
}
