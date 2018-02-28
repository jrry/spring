package com.github.jrry.webmvc.controller;

import com.github.jrry.webmvc.dto.TwoParameters;
import com.github.jrry.webmvc.dto.User;
import com.github.jrry.webmvc.service.IssuesService;
import com.github.jrry.webmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class IssuesController {

    private IssuesService issuesService;
    private UserService userService;

    @Autowired
    public IssuesController(IssuesService issuesService, UserService userService) {
        this.issuesService = issuesService;
        this.userService = userService;
    }

    @GetMapping("/template")
    public String templateTest(@RequestParam(name = "t", defaultValue = "hello") String t, Model model) {
        model.addAttribute("templateParam", t);
        model.addAttribute("user", new User());
        return "form1";
    }

    @GetMapping("/template/list")
    public String templateList(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "lista";
    }

    @PostMapping("/template/adduser")
    public String addUserForm(@ModelAttribute @Valid User user, BindingResult errors) {
        if (errors.hasFieldErrors()) {
            return "form1";
        }
        userService.addUser(user);
        return "redirect:/template/list";
    }

    @GetMapping("/custom")
    @ResponseBody
    public String customParamTest(@RequestParam(name = "custom") TwoParameters twoParameters) {
        return "Pierwszy parametr: " + twoParameters.getFirst() + " i drugi: " + twoParameters.getSecond();
    }

    @GetMapping
    @ResponseBody
    public String test(@RequestParam(name = "rower", required = false) String param) {
        return issuesService.getIssue() + " " + param;
    }

    @GetMapping(path = {"/{test2}/{opt}","/{test2}"}, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String test2(@PathVariable("test2") String param, @PathVariable("opt") Optional<Integer> opt) {
        return "Tą jęst wpiśany parametr ó nazwie: " + param + opt.orElse(0);
    }

    @ExceptionHandler(IOException.class)
    @ResponseBody
    public String handleIOError() {
        return "blad i/o";
    }
}
