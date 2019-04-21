FROM maven:3.5-jdk-8

VOLUME /tmp

ARG SPRING_PROFILES_ACTIVE
ENV SPRING_PROFILES_ACTIVE="$SPRING_PROFILES_ACTIVE"

ADD ./build/libs/app.jar /app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./uradom -jar /app.jar" ]
