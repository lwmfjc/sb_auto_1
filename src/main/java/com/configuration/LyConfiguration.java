package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.service.ILyService;
import com.service.impl.LyServiceImpl2;

@Configuration
public class LyConfiguration {
    @Bean
    public ILyService lyService(){
        return new LyServiceImpl2();
    }
}
