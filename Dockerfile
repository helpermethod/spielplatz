FROM hub.predic8.de/p8/java
ADD target/*.jar /app
CMD java -jar /app/*.jar