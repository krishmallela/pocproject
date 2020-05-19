FROM openjdk:8
EXPOSE 8282
ADD target/eureka-service.jar eureka-service.jar 
ENTRYPOINT ["java","-jar","/eureka-service.jar"]