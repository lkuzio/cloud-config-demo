package xyz.javista.mvc.client.plugin;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

@Configuration
@PropertySource("classpath:application.properties")
public class CloudConfig4WebMvcConfiguration implements EnvironmentAware {

    Environment environment;

    @Bean
    public PropertySourcesPlaceholderConfigurer properties() throws MalformedURLException {
        String appName = this.environment.getProperty("spring.application.name");
        String profile = this.environment.getProperty("spring.profiles.active");
        String configUrl = this.environment.getProperty("spring.cloud.config.uri");
        PropertySourcesPlaceholderConfigurer pspc
                = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new UrlResource[]
                {new UrlResource(String.format("%s/%s-%s.properties", configUrl, appName, profile))};
        pspc.setLocations(resources);
        pspc.setIgnoreUnresolvablePlaceholders(true);
        return pspc;
    }

    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }
}
