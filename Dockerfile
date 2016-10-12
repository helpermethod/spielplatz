FROM hub.predic8.de/p8/java
ADD target/*.jar /app/app.jar
CMD java -jar /app/app.jar