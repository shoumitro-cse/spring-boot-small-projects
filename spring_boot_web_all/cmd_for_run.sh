# Run this project
mvn deploy
java -jar ./target/new_file_package_name.jar

or

mvn deploy || java -jar ./target/new_file_package_name.jar



cd /home/shoumitro/Documents/html_ex/Spring Boot Project/gradle_web; 
JAVA_HOME=/home/shoumitro/jdk1.8.0_171 
/home/shoumitro/netbeans-8.2/java/maven/bin/mvn "-Dexec.args=-classpath %classpath com.example.servingwebcontent.ServingWebContentApplication" -Dexec.executable=/home/shoumitro/jdk1.8.0_171/bin/java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec


Here => com.example.servingwebcontent.ServingWebContentApplication is a @SpringBootApplication class that user manually create.

mvn "-Dexec.args=-classpath %classpath com.example.servingwebcontent.ServingWebContentApplication" -Dexec.executable=java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec


# spring boot run from jar file
cd target
java -jar gradle_web-0.0.1-SNAPSHOT.jar
