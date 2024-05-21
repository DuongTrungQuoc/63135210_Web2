package org.o7planning.thymeleaf.controller;

import org.o7planning.thymeleaf.service.HangHoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Autowired
    private HangHoaService hangHoaService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listHangHoa", hangHoaService.getAllHangHoa());
        return "index";
    }
}
