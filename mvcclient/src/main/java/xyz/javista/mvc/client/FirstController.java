package xyz.javista.mvc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class FirstController {

    @Value("${somecustom.property1}")
    private String property1;

    @Value("${somecustom.isProdEnv}")
    private Boolean isProdEnv;


    @RequestMapping(method = RequestMethod.GET)
    public String getHelloWorldProperties() {
        return String.format("Hello in Cloud World with Spring MVC! [%s] isProdEnv=%s", property1, isProdEnv);
    }
}
