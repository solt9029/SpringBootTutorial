FROM maven:3.5-jdk-8

ADD ./build/libs/app.jar /app.jar
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./uradom -jar /app.jar" ]
