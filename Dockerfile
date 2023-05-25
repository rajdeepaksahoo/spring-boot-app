FROM openjdk:11
COPY Target/spring-bbo-app-1.1.jar /usr/app/spring-bbo-app-1.1.jar
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","spring-bbo-app-1.1.jar"]