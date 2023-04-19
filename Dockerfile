FROM openjdk:17
EXPOSE 8080
ADD target/RendiWeb.jar RendiWeb.jar
ENTRYPOINT ["java", "-jar", "/RendiWeb.jar"]