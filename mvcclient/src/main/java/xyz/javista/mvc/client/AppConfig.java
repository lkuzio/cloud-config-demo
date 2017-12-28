package xyz.javista.mvc.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import xyz.javista.mvc.client.plugin.EnableSpringCloudConfig;


@EnableWebMvc
@EnableSpringCloudConfig
@Configuration
@ComponentScan("xyz.javista.mvc")
public class AppConfig extends WebMvcConfigurerAdapter {


}
