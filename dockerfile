# use jdk temurin
FROM eclipse-temurin:17-jdk AS builder

# define work-directory
WORKDIR /app

# copy gradle files from my project and src folder to we can run a build
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle/
COPY src ./src/


# gives gradle adm permission because for SOME REASON HE CANT BUILD WITHOUT!!!!!!!!!!!!!!
RUN chmod +x ./gradlew

# runs gradle build
RUN ./gradlew build --no-daemon

# USE TEMURIN TO BUILD APP
FROM eclipse-temurin:17-jdk

WORKDIR /app

# copy the jar from the build
COPY --from=builder /app/build/libs/*.jar app.jar

# execute finaly
ENTRYPOINT ["java", "-jar", "app.jar"]