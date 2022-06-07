package com.flowable.flowableui;

import com.flowable.flowableui.configuration.AppDispatcherServletConfiguration;
import com.flowable.flowableui.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
@EnableTransactionManagement
@SpringBootApplication
public class FlowableUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableUiApplication.class, args);
    }

}
