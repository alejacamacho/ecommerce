# Usar la imagen de OpenJDK 21 como base
FROM eclipse-temurin:21-jdk AS build

# Configurar el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR generado por Maven
COPY target/ecommerce-backend.jar app.jar

# Exponer el puerto donde correrá la app
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]