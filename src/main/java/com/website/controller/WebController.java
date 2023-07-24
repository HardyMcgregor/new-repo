package com.website.controller;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.website.service.Service.InternService;
import com.website.service.Service.MentorService;

@Controller
public class WebController {
    private final InternService internService;
    private final MentorService mentorService;

    public WebController(InternService internService, MentorService mentorService) {
        this.internService = internService;
        this.mentorService = mentorService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("interns", internService.getAllInterns());

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();

        if (email.endsWith("mentor@gmail.com")) {
            model.addAttribute("mentors", mentorService.getAllMentors());
        }
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }
}