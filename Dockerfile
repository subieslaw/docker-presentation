FROM maven:3.5-jdk-8 as BUILD
run git clone https://github.com/subieslaw/docker-presentation.git
RUN mkdir -p /usr/src/myapp/src
COPY src /usr/src/myapp/src
COPY pom.xml /usr/src/myapp
RUN mvn -f /usr/src/myapp/pom.xml clean package
 
FROM jboss/wildfly:8.2.0.Final
 
COPY --from=BUILD /usr/src/myapp/target/docker-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/docker-1.0-SNAPSHOT.war