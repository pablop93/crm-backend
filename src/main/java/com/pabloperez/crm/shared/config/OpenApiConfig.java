package com.pabloperez.crm.shared.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI crmOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("B2B CRM API")
                        .description("B2B CRM backend: customers, contacts, sales opportunities, and commercial activity.")
                        .version("v1"));
    }
}