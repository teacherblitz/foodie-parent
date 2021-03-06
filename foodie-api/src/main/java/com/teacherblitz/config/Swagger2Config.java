package com.teacherblitz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 配置
 * @author teacherblitz
 * @since 2020/5/8
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    public Docket initSwagger2Api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .groupName(applicationName)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.teacherblitz.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("teacherblitz", "www.teacherblitz.com", "teacherblitz@gmail.com");
        return new ApiInfoBuilder()
                .title("博客卖家-API")
                .contact(contact)
                .description("朱老师发明的博客卖家api")
                .termsOfServiceUrl("www.teacherblitz.com")
                .version("v.1.0.0")
                .build();
    }

}
