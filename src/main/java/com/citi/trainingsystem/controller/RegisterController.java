package com.citi.trainingsystem.controller;

import com.citi.trainingsystem.entity.Product;
import com.citi.trainingsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @Autowired
    ProductRepository userRepo;

    @GetMapping(value ="/register")
    public String register(Model model, Product user) {
        model.addAttribute("user", user);
        return "register";
    }

    @GetMapping(value ="/reg")
    public String addUser(Model model, Product user) {
        model.addAttribute("user", user);
        Product isNewUser = userRepo.findProductByName(user.getName());
        if (null == isNewUser) {
            userRepo.save(user);
            return "redirect:register?success";
        } else {
            return "redirect:register?error";
        }
    }
}
