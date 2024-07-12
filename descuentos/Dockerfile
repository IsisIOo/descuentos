FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} descuentos.jar
ENTRYPOINT ["java", "-jar", "/descuentos.jar"]