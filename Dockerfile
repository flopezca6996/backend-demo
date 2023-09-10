FROM amazoncorretto:17-alpine-jdk

ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

COPY ./build/libs/* /app.jar
RUN chmod +x /app.jar

COPY docker/entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/entrypoint.sh"]