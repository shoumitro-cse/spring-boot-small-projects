#  http://localhost:8080/
./gradlew bootRun


./gradlew clean build
curl localhost:8080
./gradlew bootRun --args='--spring.profiles.active=dev'
 ./gradlew bootRun -Pprofile=dev
  gradlew bootRun "-Dspring.profiles.active=local,protractor"
./gradlew tasks
./gradlew tasks --all
