package src.com.jbehave;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/*
http://jbehave.org/reference/stable/developing-stories.html
*/


public abstract class SampleJbehaveTest extends JUnitStory {
    //protected final static WebSpec WebBrowser = new WebSpec().ie();
 
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
            //.useStoryLoader(new LoadFromClasspath(this.getClass().getClassLoader()))
            .useStoryReporterBuilder(
                    new StoryReporterBuilder()
                        .withDefaultFormats()
                        //.withFormats(Format.HTML, Format.CONSOLE)
                        //.withRelativeDirectory("jbehave-report")
            );
    }
 
    @Override
    public InstanceStepsFactory candidateSteps() {
        return new InstanceStepsFactory(configuration(), new SampleJbehaveSteps()); 
        //this).createCandidateSteps();
    }
}