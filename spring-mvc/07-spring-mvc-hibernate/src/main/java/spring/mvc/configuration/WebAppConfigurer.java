package spring.mvc.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Similar to spring-mvc-servlet.xml
 */
@Configurable
@ComponentScan(basePackages = "spring.mvc")
@EnableWebMvc
public class WebAppConfigurer implements WebMvcConfigurer {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/*
		 * <!-- Add support for static resources --> <mvc:resources
		 * mapping="/resources/**" location="/static/" ></mvc:resources>
		 */
		registry.addResourceHandler("/resources/**").addResourceLocations("/static/");
	}
}