package com.jiji.admindemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping("/")
    fun index() = "index"

    @RequestMapping("/home")
    fun home(model: Model): String {
        model.addAttribute("hello", "Hello admin")
        return "home"
    }

    @RequestMapping("/login")
    fun login() = "login"

}