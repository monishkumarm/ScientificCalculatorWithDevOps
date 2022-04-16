FROM openjdk:8
COPY ./target/ScientificCalculatorWithDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "ScientificCalculatorWithDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]