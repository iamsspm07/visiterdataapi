FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar VisitersDatabase.jar
ENTRYPOINT ["java","-jar","/VisitersDatabase.jar"]
EXPOSE 1234