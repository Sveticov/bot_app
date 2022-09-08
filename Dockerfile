FROM openjdk:18-alpine
MAINTAINER svetikov.org
COPY build/libs/bot_app-0.0.1-SNAPSHOT.jar my-bot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/my-bot.jar"]
