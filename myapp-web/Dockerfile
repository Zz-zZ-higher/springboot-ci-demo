FROM openjdk:17-jdk-slim
WORKDIR /app
ARG JAR_FILE=target/myapp-web-1.0.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
