# Run this project
mvn deploy
java -jar ./target/gradle_web-0.0.1-SNAPSHOT.jar




# set maven dir to environment variable  
/home/shoumitro/Downloads/apache-maven-3.6.3/bin
or 
/home/shoumitro/netbeans-8.2/java/maven/bin/


# some maven command
mvn build 
mvn deploy
mvn dependency:purge-local-repository
mvn clean deploy -P PROD
mvn deploy -DrepositoryId=nexus-releases
mvn clean install
mvn deploy -X #for debug
mvn deploy -r #for re-run
mvn compile
mvn package
 
 
# spring boot run from jar file
cd target
java -jar project_jar_file_name.jar
example: 
  java -jar gradle_web-0.0.1-SNAPSHOT.jar

 
cd /home/shoumitro/Documents/html_ex/Spring Boot Project/gradle_web
JAVA_HOME=/home/shoumitro/jdk1.8.0_171 
/home/shoumitro/netbeans-8.2/java/maven/bin/mvn "-Dexec.args=-classpath %classpath com.example.servingwebcontent.ServingWebContentApplication" -Dexec.executable=/home/shoumitro/jdk1.8.0_171/bin/java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec


or

Here => com.example.servingwebcontent.ServingWebContentApplication is a @SpringBootApplication class that user manually create.

mvn "-Dexec.args=-classpath %classpath com.example.servingwebcontent.ServingWebContentApplication" -Dexec.executable=java -Dexec.classpathScope=runtime org.codehaus.mojo:exec-maven-plugin:1.2.1:exec
