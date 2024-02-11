FROM openjdk:17-jdk
WORKDIR /junittestcases
COPY target/junittestcases.jar junittestcases.jar
EXPOSE 8082
CMD ["java", "-jar", "junittestcases.jar"]