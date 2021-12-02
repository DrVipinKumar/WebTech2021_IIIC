package edu.kiet.AnotationBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="edu.kiet.AnotationBased")
public class AnotationConfig {
	
	/*@Bean
	public KotlinChild getKotlin()
	{
		return new KotlinChild();
	}
	@Bean
	public JavaFeatures getJava()
	{
		return new JavaFeatures();
	}*/

}
