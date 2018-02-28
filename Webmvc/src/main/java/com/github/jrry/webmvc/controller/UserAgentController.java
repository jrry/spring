package com.github.jrry.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/agent")
public class UserAgentController {

    @GetMapping
    @ResponseBody
    public String agentUserowy(@RequestHeader(value = "User-Agent") String userAgent) {
        return userAgent;
    }

    @GetMapping("/all")
    @ResponseBody
    public String allParams(@RequestHeader Map<String, String> map) {
        return "zawartosc: " + map;
    }
}
