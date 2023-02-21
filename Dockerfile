FROM openjdk:16.0.2
LABEL maintainer="demo-fisclouds-api"
ADD target/demo-payment-service-0.0.1-SNAPSHOT.jar payment-svc.jar
ENTRYPOINT ["java","-jar", "payment-svc.jar"]
