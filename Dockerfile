FROM openjdk:17-jdk-slim-buster

WORKDIR /dataSimulatorIoT

COPY /target/DataSimulatorIoT-1.0-SNAPSHOT.jar /dataSimulatorIoT/DataSimulatorIoT.jar

ENTRYPOINT java -jar DataSimulatorIoT.jar