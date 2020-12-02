#
# Build stage
#
FROM maven:3-jdk-8 AS build
WORKDIR /home/app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn -Dmaven.test.skip -Dossindex.skip=true clean package dependency:copy-dependencies

#
#
# Package stage
#
FROM openjdk:8
COPY --from=build /home/app/target/classes /target/classes
COPY --from=build /home/app/target/dependency /target/dependency
RUN java -Xmx2048m -cp "target/dependency/*:target/classes/"    \
    uk.jessjenkins.App