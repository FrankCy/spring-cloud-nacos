package com.frank.cloud.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author cy
 * @version ProviderController.java, v 0.1 2021年05月27日 3:54 下午 cy Exp $
 */
@RestController
public class ProviderController{

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos provider registry, server port: "+ serverPort+"\t id"+id;
    }
}

