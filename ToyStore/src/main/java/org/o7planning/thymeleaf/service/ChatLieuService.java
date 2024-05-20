package org.o7planning.thymeleaf.service;

import java.util.List;

import org.o7planning.thymeleaf.model.ChatLieu;
import org.o7planning.thymeleaf.repository.ChatLieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatLieuService {
	@Autowired
    private ChatLieuRepository chatLieuRepository;

    public List<ChatLieu> getAllChatLieu() {
        return chatLieuRepository.findAll();
    }

    public void saveChatLieu(ChatLieu chatLieu) {
        chatLieuRepository.save(chatLieu);
    }

    public ChatLieu getChatLieuById(Integer id) {
        return chatLieuRepository.findById(id).orElse(null);
    }

    public void deleteChatLieuById(Integer id) {
        chatLieuRepository.deleteById(id);
    }
}
