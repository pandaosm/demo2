# Use an OpenJDK Runtime as a parent image
#FROM openjdk:11-jre-alpine
FROM amazoncorretto:11-alpine-jdk

# Define environment variables
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \JAVA_OPTS=""

# Set the working directory to /app
WORKDIR /app

# Copy the executable into the container at /app
ADD target/*.jar demoref.jar

# Make port 8085 available to the world outside this container
EXPOSE 8085

# Run app.jar when the container launches
CMD ["java", "-jar", "/app/demoref.jar"] 