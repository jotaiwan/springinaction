package com.chapter02.autoconfig;

        import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@Component("lonelyHeartClub")
public class SgtPeppersWithSpecifyComponentName  {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band - Specify Component Name";
    private String artistt = "The Beatles - Specify Component Name";

    public void play2() {
        System.out.println("Playing " + title + " by " + artistt);
    }
}
