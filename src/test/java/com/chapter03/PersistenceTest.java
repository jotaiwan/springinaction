package com.chapter03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jotaiwan on 3/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={PersistenceTest.class})
@ActiveProfiles("dev")
public class PersistenceTest {
    @Test
    public void test() {
        System.out.println("Just a test");
    }
}
