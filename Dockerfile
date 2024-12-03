FROM openjdk:17-jdk-alpine
COPY ./target/java17sepdemo-1.0-SNAPSHOT.jar java17sepdemolearning.jar
ENTRYPOINT ["java","-jar","java17sepdemolearning.jar"]