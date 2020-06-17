package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    @GetMapping ("/admin")
    public ModelAndView getAdminPage() {
        return  new ModelAndView("admin");
    }

    @GetMapping ("/admin/monitor")
    public ModelAndView getAdminMonitorPage() {
        return  new ModelAndView("admin");
    }

    @GetMapping ("/user")
    public ModelAndView getUserPage() {
        return  new ModelAndView("user");
    }

    @GetMapping("/articles")
    public ModelAndView getArticlePage() {
        return  new ModelAndView("articles");
    }

    @GetMapping("/accessDenied")
    public ModelAndView getAccessDeniedPage() {
        return  new ModelAndView("articles");
    }
}
