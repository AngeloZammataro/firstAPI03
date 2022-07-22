/*
Primi passi - First API - 03

    write a Spring Boot application with the necessary dependencies that has:
        a StringController that:
            is mapped on strings
            returns the concatenation of 2 strings (the first is mandatory, the second is not) params
                handle the case where the second string is null (we want to return just the first string)
    test the API endpoint with Postman, executing 2 GET requests:
        with just the first param
        with both the params
 */

package it2.develhope.firstAPI03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApi03Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApi03Application.class, args);
	}

}
