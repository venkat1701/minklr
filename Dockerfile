# Use a base image with OpenJDK
FROM openjdk:23

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application's JAR file into the container
COPY build/libs/minklr-0.0.1-SNAPSHOT.jar minklr.jar

# Expose the port that your Spring Boot application runs on (default: 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "minklr.jar"]
