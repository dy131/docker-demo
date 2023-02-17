FROM openjdk:8-jre
ADD target/docker-demo-1.0-SNAPSHOT.jar docker-demo.jar
EXPOSE 6579
ENTRYPOINT ["java","-jar"]
CMD ["/docker-demo.jar"]