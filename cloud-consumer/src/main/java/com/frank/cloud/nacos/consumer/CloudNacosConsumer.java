package com.frank.cloud.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 *
 * @author cy
 * @version ConsumerController.java, v 0.1 2021年05月27日 4:21 下午 cy Exp $
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudNacosConsumer{

    public static void main(String[] args){
        SpringApplication.run(CloudNacosConsumer.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
