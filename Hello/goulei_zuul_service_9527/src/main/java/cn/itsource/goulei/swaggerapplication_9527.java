package cn.itsource.goulei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //启动路由
public class swaggerapplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run( swaggerapplication_9527.class);
    }
}
