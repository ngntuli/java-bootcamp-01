package com.ngntuli.bootweb;

import com.ngntuli.bootweb.ch04.models.RequestDataDefault;
import com.ngntuli.bootweb.ch04.models.RequestDataScope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class BootWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootWebApplication.class, args);
    }

    @Bean("protoDefaultBean")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public RequestDataDefault dataDefault() {
        return new RequestDataDefault();
    }

//    @Bean("requestDataDefaultBean")
//    @RequestScope
//    public com.ngntuli.bootweb.ch04.models.RequestDataDefault requestDataDefault() {
//        return new com.ngntuli.bootweb.ch04.models.RequestDataDefault();
//    }

    @Bean("requestScopeBean")
    @RequestScope
    public RequestDataScope requestDataScope() {
        return new RequestDataScope();
    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}
