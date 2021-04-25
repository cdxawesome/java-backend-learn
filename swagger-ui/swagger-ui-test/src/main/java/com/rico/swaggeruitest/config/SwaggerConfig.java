package com.rico.swaggeruitest.config;

import com.rico.swaggeruitest.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.rico.swaggeruitest")
                .contactName("rico")
                .description("swagger-ui的测试代码")
                .title("Swagger-ui-test")
                .contactEmail("hoktextbox@aliyun.com")
                .version("1.0")
                .build();
    }
}
