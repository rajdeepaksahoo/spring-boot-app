FROM openjdk:11
COPY target/spring-boot-app-1.1.jar /usr/app/spring-boot-app-1.1.jar
WORKDIR /usr/app
RUN sh -c 'touch spring-boot-app-1.1.jar'
ENTRYPOINT ["java","-jar","spring-boot-app-1.1.jar"]