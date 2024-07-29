# Use a imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim

# Crie um diretório para o aplicativo
VOLUME /tmp

# Copie o arquivo JAR gerado pelo Maven para o contêiner
COPY target/desafio-projeto-0.0.1-SNAPSHOT.jar app.jar

# Defina o ponto de entrada para a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/desafio-projeto-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

