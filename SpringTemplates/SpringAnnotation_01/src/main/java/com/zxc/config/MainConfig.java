package com.zxc.config;

import com.zxc.model.Person;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.zxc")
public class MainConfig {

    @Bean(name = "person")
    @Scope(value = "singleton")
    @Lazy
    public Person createPerson(){
        return new Person("绣虎",20);
    }

}
