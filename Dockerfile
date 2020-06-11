FROM openjdk:11.0.6-jre-slim

COPY target/*.jar /app/app.jar

EXPOSE 8080

USER 1001

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
