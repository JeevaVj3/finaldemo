FROM eclipse-temurin:17 
COPY target/finaldemo.jar finaldemo.jar
CMD [ "java", "-jar", "finaldemo.jar" ]