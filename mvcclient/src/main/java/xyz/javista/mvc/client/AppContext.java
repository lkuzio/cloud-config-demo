package xyz.javista.mvc.client;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppContext extends AnnotationConfigWebApplicationContext {

    public AppContext() {
        register(new Class[] {AppConfig.class});
    }
}
