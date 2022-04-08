# fromIntelliJWizardForJavaFX

Sample usage of JAVAFX directly from JavaFX project from intelliJ Wizard.

Also shown maven test support.
In the following all the steps if Yiu start from scratch.

After creating javaFx App, to create tests, simoly:

1) duplicate "main" folder
2) change contents and files (initial file must be removed...)
3) create tests form classes using intelliJ "generate"
4) move them here OR simpole create as below...
5) mark as "test" the 'test/java" folder (green in intellJ)
6) in POM add surefire plugin:

     <!-- added for Maven testing -->
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.19.1</version>
            </plugin>

in "build" section of POM.

7) test on "mvn test".

8) If You got:
  Unsupported class file major version 62

You must lower maven-surefire-plugin version.
Use 2.19.1.

<version>2.22.2</version> is NOT supported.

9) NO support for shade Plugin for now.

---- sample test class:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
   @Test
   public void shouldAnswerWithTrue()
   {
      assertTrue( true );
   }

   @Test
   public void shouldAnswerWithTrueAgain()
   {
      assertTrue( true );
   }
}

