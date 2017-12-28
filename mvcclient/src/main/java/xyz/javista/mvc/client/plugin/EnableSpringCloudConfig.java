package xyz.javista.mvc.client.plugin;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({CloudConfig4WebMvcConfiguration.class})
public @interface EnableSpringCloudConfig {
}
