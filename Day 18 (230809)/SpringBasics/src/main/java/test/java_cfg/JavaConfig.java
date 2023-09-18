package test.java_cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Book getBook() {
		return new Book("Let Us C", 200);
	}

	@Bean
	public Student getStudent() {
		return new Student("Ashutosh", "PCM" , getBook() );
	}
}
