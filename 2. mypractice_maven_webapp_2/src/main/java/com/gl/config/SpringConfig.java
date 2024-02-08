package com.gl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * Configuration class for Thymeleaf and Spring MVC.
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.gl")
public class SpringConfig {

    // Application context
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * Configures the Thymeleaf template resolver.
     *
     * @return Thymeleaf template resolver bean.
     */
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        // Thymeleaf template resolver configuration
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(this.applicationContext);
        templateResolver.setPrefix("/WEB-INF/view/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(true);
        return templateResolver;
    }

    /**
     * Configures the Thymeleaf template engine.
     *
     * @return Thymeleaf template engine bean.
     */
    @Bean
    public SpringTemplateEngine templateEngine() {
        // Thymeleaf template engine configuration
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());  // Speed up the compiling process
        templateEngine.setEnableSpringELCompiler(true);
        return templateEngine;
    }

    /**
     * Configures the Thymeleaf view resolver.
     *
     * @return Thymeleaf view resolver bean.
     */
    @Bean
    public ThymeleafViewResolver viewResolver() {
        // Thymeleaf view resolver configuration
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        return viewResolver;
    }
}
