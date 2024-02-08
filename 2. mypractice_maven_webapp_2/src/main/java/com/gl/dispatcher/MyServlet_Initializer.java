package com.gl.dispatcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.gl.config.SpringConfig;

/**
 * Initializer class for configuring the DispatcherServlet and Spring context.
 */
public class MyServlet_Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Specify configuration classes for the root application context.
     *
     * @return An array of configuration classes; empty array in this case.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * Specify configuration classes for the Servlet application context.
     *
     * @return An array of configuration classes; contains SpringConfig class in this case.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * Specify servlet mappings for the DispatcherServlet.
     *
     * @return An array of servlet mappings; "/" in this case.
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
