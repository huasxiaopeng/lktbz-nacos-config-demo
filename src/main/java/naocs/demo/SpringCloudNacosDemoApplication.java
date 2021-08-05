package naocs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //激活nacos
public class SpringCloudNacosDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosDemoApplication.class, args);
    }

}
