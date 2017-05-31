package com.chapter02.autoconfig;

import org.apache.commons.lang3.StringUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private SgtPeppersWithSpecifyComponentName sgtPeppersWithSpecifyComponentName;


    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void sgtPeppersWithSpecifyComponentNameShouldNotBeNull() {
        assertNotNull(sgtPeppersWithSpecifyComponentName);
    }

    @Test
    public void play() {
        player.play();
        assertTrue(StringUtils.contains(log.getLog(), "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles"));
//        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n", log.getLog());
    }

}
