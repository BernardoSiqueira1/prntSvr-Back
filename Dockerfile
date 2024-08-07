FROM openjdk:17-jdk-alpine

WORKDIR /application

COPY ./img /application/img

COPY ./prntSaver-v1.jar /application/prntSaver.jar

ENV SV_RESOURCE_LOCATION=/application/img/

ENTRYPOINT ["java", "-jar", "prntSaver.jar"]
