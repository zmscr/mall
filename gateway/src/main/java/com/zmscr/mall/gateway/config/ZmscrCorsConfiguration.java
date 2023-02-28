package com.zmscr.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
/*
* 解决跨域问题
* */
@Configuration
public class ZmscrCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        //1.跨域配置
        //1.1请求头
        corsConfiguration.addAllowedHeader("*");
        //1.2 请求方法
        corsConfiguration.addAllowedMethod("*");
        //1.3 请求来源
        corsConfiguration.addAllowedOrigin("*");
        //1.4 是否允许携带cookies跨域
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}
