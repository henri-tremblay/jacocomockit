package com.acme.test;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Before
    public void setUp() {
        final MyService service = new MockUp<MyService>() {
            @Mock
            public MyInterface findById(final String id) {
                return null;
            }
        }.getMockInstance();
    }

    @Test
    public void test() {}
}
