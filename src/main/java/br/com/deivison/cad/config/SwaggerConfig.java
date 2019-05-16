package br.com.deivison.cad.config;



import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SuppressWarnings("deprecation")
@Configuration
@EnableSwagger2
//@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurerAdapter{

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)  
        .select()                                  
        .apis(RequestHandlerSelectors.basePackage("br.com.deivison.cad.controller"))              
        .paths(PathSelectors.any())                          
        .build()
        .apiInfo(apiInfo()); 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("swagger-ui.html")
	      .addResourceLocations("classpath:/META-INF/resources/");
	 
	    registry.addResourceHandler("/webjars/**")
	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "Aplicação WEB com camada Rest. Consumindo API de consulta a CEP dos Correios", 
	      "", 
	      "", 
	      "", 
	      new Contact("Deivison V. D. Reis", "", "deivisomreis@gmail.com"), 
	      "Cadastro de pessoa", "API de consulta a CEP dos Correios", Collections.emptyList());
	}
}
