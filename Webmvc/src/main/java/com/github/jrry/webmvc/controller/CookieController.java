package com.github.jrry.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping
    @ResponseBody
    public String cookies(@RequestParam(name = "ust", required = false) String param,
                          HttpServletResponse response,
                          @CookieValue(name = "ciastko", required = false, defaultValue = "0") String cookieValue) {
        if (param != null) {
            response.addCookie(new Cookie("ciastko", param));
            return "ustawiono ciastko na wartosc: " + param;
        }
        return "wczytano z ciastka wartosc: " + cookieValue;
    }

    @GetMapping("/sesja")
    @ResponseBody
    public String sessionTest(@RequestParam(name = "ust", required = false) String sessionParam,
                              @SessionAttribute(name = "login", required = false) String sessionLogin, HttpServletRequest request) {
        if (sessionParam != null) {
            request.getSession().setAttribute("login", sessionParam);
            return "ustawiono w sesji parametr login na: " + sessionParam;
        }

        return "odczytano login z sesji: " + sessionLogin;
    }
}
