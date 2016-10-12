FROM hub.predic8.de/p8/java
ADD target/*.jar /app
CMD /bin/bash -c 'java -jar /app/*.jar'