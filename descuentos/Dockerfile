FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} descuento.jar
ENTRYPOINT ["java", "-jar", "/descuento.jar"]