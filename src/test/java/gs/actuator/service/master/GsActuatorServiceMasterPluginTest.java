/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gs.actuator.service.master;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A simple unit test for the 'gs.actuator.service.master.greeting' plugin.
 */
public class GsActuatorServiceMasterPluginTest {
    @Test public void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("gs.actuator.service.master.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
