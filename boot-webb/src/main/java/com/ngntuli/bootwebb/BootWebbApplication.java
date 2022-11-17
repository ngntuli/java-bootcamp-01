package com.ngntuli.bootwebb;

import com.ngntuli.bootwebb.web.data.ch05.enhanced.RequestDataEnhanced;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BootWebbApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootWebbApplication.class, args);
    }

    @Bean("protoDefaultBean")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RequestDataEnhanced dataEnhanced() {
        return new RequestDataEnhanced();
    }
}
