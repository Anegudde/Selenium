package com.bdd.jbehave.twdd;
 
//import net.twasink.jbehave.simple.steps.BaconCookingSteps;
import com.bdd.jbehave.twdd.twddDetailedSteps;

/*
 * http://twasink.net/2012/06/25/ail-simplest-jbehave-scenario/
*/

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
 
public class twddDetailedStory extends JUnitStory {
 
    @Override public Configuration configuration() {
        return new MostUsefulConfiguration();
    }
 
    @Override public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
        		new twddDetailedSteps());
                //new BaconCookingSteps());
    }
}