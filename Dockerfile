FROM openjdk:20-slim
LABEL maintainer="demo-fisclouds-api"
ADD target/demo-payment-service-0.0.1-SNAPSHOT.jar payment-svc.jar
ENTRYPOINT ["java","-jar", "payment-svc.jar"]
