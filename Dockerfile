FROM openjdk:8

ARG DOCKER_PATH=/c/target
ARG DOCKER_JAR_PATH=/c/target/

EXPOSE 8090

ADD /target ${DOCKER_PATH}
COPY /target/*.jar ${DOCKER_JAR_PATH}
COPY /target/*.yml ${DOCKER_JAR_PATH}

WORKDIR ${DOCKER_PATH}

CMD java -jar icc-rest-service-0.0.1.jar
