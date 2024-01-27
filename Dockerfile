FROM openjdk:17-jdk-alpine3.14

COPY target/Library-0.0.1-SNAPSHOT.jar /Library.jar

CMD [ "java", "-jar", "/Library.jar"]