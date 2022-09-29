# Use an OpenJDK Runtime as a parent image
FROM openjdk:8-jdk-alpine
#FROM amazoncorretto-17
#FROM adoptopenjdk/openjdk15:ubi



# Define environment variables
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \JAVA_OPTS=""

# Set the working directory to /app
WORKDIR /app

# Copy the executable into the container at /app
ADD target/*.jar clientmicro.jar

# Make port 8085 available to the world outside this container
EXPOSE 8092

# Run app.jar when the container launches
CMD ["java", "-jar", "/app/demoref.jar"]


