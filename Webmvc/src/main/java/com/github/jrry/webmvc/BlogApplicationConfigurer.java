package com.github.jrry.webmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BlogApplicationConfigurer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{BlogAppConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{BlogWebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
