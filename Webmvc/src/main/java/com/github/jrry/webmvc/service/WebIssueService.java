package com.github.jrry.webmvc.service;

import org.springframework.stereotype.Service;

@Service
public class WebIssueService implements IssuesService {
    public String getIssue() {
        return "Issue from web";
    }
}
