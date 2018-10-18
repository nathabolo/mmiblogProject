FROM openjdk:8u151-jdk-alpine3.7

EXPOSE 3001

ENV APP_HOME /usr/src/app

COPY target/blog-demo-0.0.1-SNAPSHOT.jar $APP_HOME/app.jar

WORKDIR $APP_HOME

ENTRYPOINT exec java -jar app.jar