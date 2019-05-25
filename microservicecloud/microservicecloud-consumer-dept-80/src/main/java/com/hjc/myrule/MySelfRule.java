package com.hjc.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule hjdRule(){
        //return new RandomRule();//随机算法
        return new RandomRuleHjc(); //以前每台机器一次，现在是每台机器5次
    }
}
