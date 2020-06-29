FROM amazoncorretto:8u252-al2
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bill.jar
ENTRYPOINT ["java","-jar","/bill.jar"]