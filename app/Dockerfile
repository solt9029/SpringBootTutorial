FROM maven:3.5-jdk-8

VOLUME /tmp

ADD ./build/libs/app.jar /app.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./uradom -jar /app.jar --spring.profiles.active=prod" ]
