package com.zhuyuansj.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;



    //断路器，远程调用失败的回调函数
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        //这个service-HI就是在eurake当中注册的application,不能用ip地址，可能是集群
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }



    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}
