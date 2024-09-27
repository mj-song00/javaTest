FROM openjdk:17

WORKDIR /app

ARG JAR_FILE=./build/libs/*.jar

COPY ./build/libs/test-0.0.1-SNAPSHOT.jar app/test-0.0.1-SNAPSHOT.jar
COPY .env.local .env.local

LABEL authors="songminji"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar app/test-0.0.1-SNAPSHOT.jar -server -Dfile.encoding=UTF-8" ]