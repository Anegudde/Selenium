package com.bdd.jbehave.specs;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class StackBehaviourStory extends JUnitStory {
    @Override 
    public Configuration configuration() { return new MostUsefulConfiguration(); }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new StackbehaviourSteps());   
    }
}
