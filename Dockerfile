# Etapa 1: Compilacion y pruebas
FROM maven:3.8.3-openjdk-17 AS build

# Directorio de trabajo
WORKDIR /app

# Copiamos el archivo POM y los archivos fuente
COPY pom.xml .
COPY src ./src

# Empaquetamos la aplicacion y ejecutamos las pruebas
RUN mvn clean package -DskipTests

# Etapa 2: Construccion de la imagen final
FROM openjdk:17.0.1-jdk-slim

# Variables de entorno
ENV SPRING_PROFILE=docker

# Copiamos el archivo JAR desde la etapa de compilacion
COPY --from=build /app/target/fintonic-challenge-0.0.1-SNAPSHOT.jar /app/fintonic-challenge.jar

# Exponemos el puerto
EXPOSE 9292

# Ejecutamos la aplicacion
CMD ["java", "-jar", "/app/fintonic-challenge.jar", "--spring.profiles.active=${SPRING_PROFILE}"]