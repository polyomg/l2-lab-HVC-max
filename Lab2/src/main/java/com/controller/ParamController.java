package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParamController {
    // HIỂN THỊ FORM
    @RequestMapping("/param/form")
    public String form() {
        return "param/form";
    }

    // XỬ LÝ SUBMIT
    @PostMapping("/param/save/{x}")

    public String save(@PathVariable("x") String x,   // lấy x từ đường dẫn {x}
                       @RequestParam("y") String y,   // lấy y từ form input name="y"z`
                       Model model) {

        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "param/form";
    }
}
