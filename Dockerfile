FROM maven:alpine

EXPOSE 80

#Copy jar file
ADD ./target/hello-world-spring-0.0.1-SNAPSHOT.jar /target/hello-world-spring-0.0.1-SNAPSHOT.jar

#default command
CMD java -jar /target/hello-world-spring-0.0.1-SNAPSHOT.jar