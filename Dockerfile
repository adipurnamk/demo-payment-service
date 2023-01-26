FROM openjdk:8-jdk-alpine
ENV JAVA_OPTS=""
COPY . /src/main/java/com/fis/app/DemoApplicationService.java
WORKDIR /app
RUN javac DemoApplicationService.java
CMD ["sh", "-c", "java $JAVA_OPTS Main"]