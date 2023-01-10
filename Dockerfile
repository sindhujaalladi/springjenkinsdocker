FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/springjenkinsdocker.jar springjenkinsdocker.jar

ENTRYPOINT ["java","-jar","springjenkinsdocker.jar"]
