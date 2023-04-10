FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /opt/app
ARG JAR_FILE=build/libs/microapp-customer-1.0.0.jar
COPY ${JAR_FILE} microapp-customer.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","microapp-customer.jar"]