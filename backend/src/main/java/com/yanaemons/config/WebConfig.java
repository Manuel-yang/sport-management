package com.yanaemons.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author YanAemons
 * @date 2021/10/19 15:53
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                //允许访问的路径
                .addMapping("/**")
                //配置请求来源
                .allowedOrigins("http://localhost:8081", "null")
                //允许跨域访问的方法
                .allowedMethods("GET","POST","DELETE","PUT","OPTION")
                //是否允许携带参数
                .allowCredentials(true)
                //配置最大相应时间
                .maxAge(3600);

    }
}
