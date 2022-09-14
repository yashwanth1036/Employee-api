package com.yjp.employeeapi;


import org.springframework.context.annotation.Configuration;
@Configuration
public class SwaggerConfig {
   /* @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/users/**"))
                .apis(RequestHandlerSelectors.basePackage("com.yjp"))
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "My REST API", //title
                "Some custom description of API.", //description
                "Version 1.0", //version
                "Terms of service", //terms of service URL
                new Contact("Yashwanth", "www.example.com", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList()); // contact info
    }*/
}
