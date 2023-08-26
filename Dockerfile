FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar visitersdatabase.jar
ENTRYPOINT ["java","-jar","/visitersdatabase.jar"]
EXPOSE 1234