FROM openjdk:latest
VOLUME  /app
COPY target/docker-jenkin-integration-sample.jar docker-jenkin-integration-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkin-integration-sample.jar"]