FROM eclipse-temurin:17
COPY target/newproject.jar newproject.jar
CMD ["java","-jar","newproject.jar"]