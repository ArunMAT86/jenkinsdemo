from openjdk:17
	EXPOSE 8080
	ADD jenkinsDemo/target/myjenkinsdocker.jar myjenkinsdocker.jar
	ENTRYPOINT ["java","jar","/myjenkinsdocker.jar"]