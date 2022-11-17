package com.ngntuli.bootweb;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.SimpleThreadScope;

public class TestsConfig {
    @Bean
    public CustomScopeConfigurer scopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("session", new SimpleThreadScope());
        configurer.addScope("request", new SimpleThreadScope());
        return configurer;
    }
}
