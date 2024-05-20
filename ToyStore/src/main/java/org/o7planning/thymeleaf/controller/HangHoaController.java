package org.o7planning.thymeleaf.controller;

import java.util.List;
import org.o7planning.thymeleaf.service.ChatLieuService;
import org.o7planning.thymeleaf.service.HangHoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.o7planning.thymeleaf.model.HangHoa;

@Controller
@RequestMapping("/hanghoa")
public class HangHoaController {
	 @Autowired
	    private HangHoaService hangHoaService;
	    @Autowired
	    private ChatLieuService chatLieuService;

	    @GetMapping
	    public String getAllHangHoa(Model model) {
	        List listHangHoa = hangHoaService.getAllHangHoa();
	        model.addAttribute("listHangHoa", listHangHoa);
	        return "hanghoa";
	    }

	    @GetMapping("/add")
	    public String showAddForm(Model model) {
	        model.addAttribute("hangHoa", new HangHoa());
	        model.addAttribute("listChatLieu", chatLieuService.getAllChatLieu());
	        return "add-hanghoa";
	    }

	    @PostMapping("/save")
	    public String saveHangHoa(@ModelAttribute("hangHoa") HangHoa hangHoa) {
	        hangHoaService.saveHangHoa(hangHoa);
	        return "redirect:/hanghoa";
	    }

	    @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") Integer id, Model model) {
	        HangHoa hangHoa = hangHoaService.getHangHoaById(id);
	        model.addAttribute("hangHoa", hangHoa);
	        model.addAttribute("listChatLieu", chatLieuService.getAllChatLieu());
	        return "edit-hanghoa";
	    }

	    @PostMapping("/update/{id}")
	    public String updateHangHoa(@PathVariable("id") Integer id, @ModelAttribute("hangHoa") HangHoa hangHoa) {
	        hangHoaService.saveHangHoa(hangHoa);
	        return "redirect:/hanghoa";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteHangHoa(@PathVariable("id") Integer id) {
	        hangHoaService.deleteHangHoaById(id);
	        return "redirect:/hanghoa";
	    }
}
