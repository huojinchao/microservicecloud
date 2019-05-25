package com.hjc.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
 */
@Configuration
public class ConfigBean {
    /**
     * RestTemplate是Spring提供的用于访问Rest服务的客户端，
     * @return
     */
    @Bean
    @LoadBalanced  //加上此注解，使客户端自带负载均衡  Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();

    }

    @Bean
    public IRule hjdRule(){
        //return new RoundRobinRule();  //轮询算法
        //return new RandomRule();//随机算法
        return new RetryRule();   //先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
        //return new BestAvailableRule(); //会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
    }
}
