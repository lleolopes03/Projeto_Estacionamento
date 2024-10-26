package com.park.demo_park.Config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocOpenApiConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("security", SecurityScheme()))
                .info(
                        new Info()
                                .title("Rest Api - Estacionamento")
                                .description("Api gestão de estacionamento")
                                .version("1.0")
                                .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/licenses-2.0"))
                                .contact(new Contact().name("Leandro Lopes").email("leandro@teste.com"))

                );
    }
    private SecurityScheme SecurityScheme(){
        return new SecurityScheme()
                .description("Insira um bearer token valido para prosseguir")
                .type(SecurityScheme.Type.HTTP)
                .in(SecurityScheme.In.HEADER)
                .scheme("bearer")
                .bearerFormat("JWT")
                .name("security");


    }
}
