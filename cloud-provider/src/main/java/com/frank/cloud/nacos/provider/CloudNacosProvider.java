package com.frank.cloud.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 *
 * @author cy
 * @version CloudNacosProvider.java, v 0.1 2021年05月27日 3:43 下午 cy Exp $
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudNacosProvider {
    public static void main(String[] args) {
        SpringApplication.run(CloudNacosProvider.class, args);
    }
}
