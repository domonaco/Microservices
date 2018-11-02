FROM java:8
EXPOSE 8080
ADD build/libs/sp-example-1.0.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]