package cn.itsource.goulei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class sprigoulei_8001 {
    public static void main(String[] args) {
        SpringApplication.run( sprigoulei_8001.class);
    }
}
