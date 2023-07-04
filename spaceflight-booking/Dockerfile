FROM eclipse-temurin:17-jdk-alpine
LABEL authors="patriqu"

VOLUME /tmp
ARG SRC_JAR=build/libs/*-SNAPSHOT.jar

COPY ${SRC_JAR} /spaceflight-booking.jar

ENTRYPOINT ["java", "-jar", "/spaceflight-booking.jar"]