FROM openjdk:11
ADD target/universidad.jar universidad-1.jar
ENTRYPOINT ["java", "-jar","universidad-1.jar"]
