package com.github.jrry.webmvc;

import com.github.jrry.webmvc.service.IssuesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.jrry.webmvc.service.AppIssueService;

@Configuration
public class BlogAppConfig {

    @Bean
    public IssuesService issuesService() {
        return new AppIssueService();
    }
}
