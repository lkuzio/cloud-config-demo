package xyz.javista.cloudconfigclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigDemoClientApplication {

    @Value("${moje.trudne}")
    private String propert;


    public static void main(String[] args) {
        SpringApplication.run(CloudConfigDemoClientApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello in Cloud World! ["+propert+"]";
    }
}
