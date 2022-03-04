package com.company.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HumanManagementResourceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanManagementResourceSystemApplication.class, args);
	}

}

/*
FROM openjdk:11
VOLUME /tmp
ADD target/HumanManagementResourceSystem-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:11
WORKDIR /usr/app
ARG JAR_FILE=target/HumanManagementResourceSystem-0.0.1-SNAPSHOT.jar app.jar
COPY ${JAR_FILE} user.jar
#to run the jar file
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","user.jar"]
 */
