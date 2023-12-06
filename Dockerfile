FROM ubuntu:latest
LABEL authors="fatim"

ENTRYPOINT ["top", "-b"]

 #Use an official OpenJDK runtime as a base image
FROM openjdk:19

# Set the working directory inside the container
WORKDIR /FibonacciProject1

# Copy the compiled Java application JAR file into the container at /app
COPY target/your-FibonacciProject1.jar /app/

# Specify the command to run on container startup
CMD ["java", "-jar", "your-FibonacciProject1.jar"]