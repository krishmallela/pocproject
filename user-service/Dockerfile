FROM openjdk:8
EXPOSE 8383
ADD target/user-service.jar user-service.jar 
ENTRYPOINT ["java","-jar","/user-service.jar"]