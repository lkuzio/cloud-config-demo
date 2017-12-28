package xyz.javista.cloudconfigclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigDemoClientApplication {

    @Value("${somecustom.property1}")
    private String property1;

    @Value("${somecustom.isProdEnv}")
    private Boolean isProdEnv;


    public static void main(String[] args) {
        SpringApplication.run(CloudConfigDemoClientApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return String.format("Hello in Cloud World! [%s] isProdEnv=%s", property1, isProdEnv);
    }
}
