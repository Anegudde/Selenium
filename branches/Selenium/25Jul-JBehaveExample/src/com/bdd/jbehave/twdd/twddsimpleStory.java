package com.bdd.jbehave.twdd;
 
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
 
/*
 * http://twasink.net/2012/06/25/ail-simplest-jbehave-scenario/
*/
public class twddsimpleStory extends JUnitStory {
 
    @Override  public Configuration configuration() {
        return new MostUsefulConfiguration();
    }
}