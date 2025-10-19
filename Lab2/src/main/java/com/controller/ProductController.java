package com.controller;

import java.util.*;

import com.entity.Product;
import org.antlr.v4.runtime.atn.PredictionContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    private List<Product> items = new ArrayList<>();

    public ProductController() {
        items.add(new Product("A", 1.0));
        items.add(new Product("B", 12.0));
    }

    @GetMapping("/product/form")
    public String form(Model model) {

        Product p1 = new Product("iPhone 30", 5000.0);
        model.addAttribute("p1", p1);

        model.addAttribute("p1", p1);
        model.addAttribute("items", items);
        return "product/form";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute("p2") Product p2, Model model, RedirectAttributes redirectAttributes) {
        items.add(p2);

        redirectAttributes.addFlashAttribute("p2" ,p2);
        return "redirect:/product/form";
    }
}
