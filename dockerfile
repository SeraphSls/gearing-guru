# Use a imagem base do JDK apropriada
FROM eclipse-temurin:17-jdk AS builder

# Defina o diretório de trabalho
WORKDIR /app

# Copie os arquivos do Gradle e o código fonte
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle/
COPY src ./src/

# Execute o Gradle para construir o projeto
RUN RUN chmod +x ./gradlew build --no-daemon

# Imagem final para executar a aplicação
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copie o jar gerado para a nova imagem
COPY --from=builder /app/build/libs/*.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
