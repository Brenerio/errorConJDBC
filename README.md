# errorConJDBC

cd C:\Users\brene\Documents\NetBeansProjects\IntroduccionJDBC; "JAVA_HOME=C:\\Program Files\\Java\\jdk-20" cmd /c "\"C:\\Program Files\\NetBeans-19\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=IntroduccionJDBC \"-Dexec.executable=C:\\Program Files\\Java\\jdk-20\\bin\\java.exe\" \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-19\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Scanning for projects...

-----------------------< jdbc:IntroduccionJDBC >------------------------
Building IntroduccionJDBC 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------
The artifact mysql:mysql-connector-java:jar:8.0.33 has been relocated to com.mysql:mysql-connector-j:jar:8.0.33: MySQL Connector/J artifacts moved to reverse-DNS compliant Maven 2+ coordinates.

--- resources:3.3.1:resources (default-resources) @ IntroduccionJDBC ---
skip non existing resourceDirectory C:\Users\brene\Documents\NetBeansProjects\IntroduccionJDBC\src\main\resources

--- compiler:3.11.0:compile (default-compile) @ IntroduccionJDBC ---
Nothing to compile - all classes are up to date

--- exec:3.1.0:exec (default-cli) @ IntroduccionJDBC ---
Error: Could not find or load main class IntroduccionJDBC
Caused by: java.lang.ClassNotFoundException: IntroduccionJDBC
Command execution failed.
org.apache.commons.exec.ExecuteException: Process exited with an error: 1 (Exit value: 1)
    at org.apache.commons.exec.DefaultExecutor.executeInternal (DefaultExecutor.java:404)
    at org.apache.commons.exec.DefaultExecutor.execute (DefaultExecutor.java:166)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:1000)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:947)
    at org.codehaus.mojo.exec.ExecMojo.execute (ExecMojo.java:471)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.DirectMethodHandleAccessor.invoke (DirectMethodHandleAccessor.java:104)
    at java.lang.reflect.Method.invoke (Method.java:578)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:283)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:226)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:407)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:348)
------------------------------------------------------------------------
BUILD FAILURE
------------------------------------------------------------------------
Total time:  1.165 s
Finished at: 2024-01-15T22:29:34+01:00
------------------------------------------------------------------------
Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.1.0:exec (default-cli) on project IntroduccionJDBC: Command execution failed.: Process exited with an error: 1 (Exit value: 1) -> [Help 1]

To see the full stack trace of the errors, re-run Maven with the -e switch.
Re-run Maven using the -X switch to enable full debug logging.

For more information about the errors and possible solutions, please read the following articles:
[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
