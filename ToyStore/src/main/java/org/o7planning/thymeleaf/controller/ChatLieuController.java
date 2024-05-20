package org.o7planning.thymeleaf.controller;

import java.util.List;

import org.o7planning.thymeleaf.model.ChatLieu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.o7planning.thymeleaf.service.ChatLieuService;

@Controller
@RequestMapping("/chatlieu")
public class ChatLieuController {
	 @Autowired
	    private ChatLieuService chatLieuService;

	    @GetMapping
	    public String getAllChatLieu(Model model) {
	        List<ChatLieu> listChatLieu = chatLieuService.getAllChatLieu();
	        model.addAttribute("listChatLieu", listChatLieu);
	        return "chatlieu";
	    }

	    @GetMapping("/add")
	    public String showAddForm(Model model) {
	        model.addAttribute("chatLieu", new ChatLieu());
	        return "add-chatlieu";
	    }

	    @PostMapping("/save")
	    public String saveChatLieu(@ModelAttribute("chatLieu") ChatLieu chatLieu) {
	        chatLieuService.saveChatLieu(chatLieu);
	        return "redirect:/chatlieu";
	    }

	    @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") Integer id, Model model) {
	        ChatLieu chatLieu = chatLieuService.getChatLieuById(id);
	        model.addAttribute("chatLieu", chatLieu);
	        return "edit-chatlieu";
	    }

	    @PostMapping("/update/{id}")
	    public String updateChatLieu(@PathVariable("id") Integer id, @ModelAttribute("chatLieu") ChatLieu chatLieu) {
	        chatLieuService.saveChatLieu(chatLieu);
	        return "redirect:/chatlieu";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteChatLieu(@PathVariable("id") Integer id) {
	        chatLieuService.deleteChatLieuById(id);
	        return "redirect:/chatlieu";
	    }
}
