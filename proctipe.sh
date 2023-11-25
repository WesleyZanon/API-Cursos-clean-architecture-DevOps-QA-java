web:  java $JAVA_OPTS -Dserver.port=$PORT -Dspring.profiles.active=prod -jar target/*.war

spring.datasource.url-jdbc:postgresql:localhost:5432/blog-cursoscomp
spring.datasource.username=postgres
spring.datasource.password=adl123
spring.jpa.hibernate.ddl-auto=updat
