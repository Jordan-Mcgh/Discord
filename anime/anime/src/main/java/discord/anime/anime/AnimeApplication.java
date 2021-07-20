package discord.anime.anime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AnimeApplication {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setSuffix(".html");
		return internalResourceViewResolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}

}
