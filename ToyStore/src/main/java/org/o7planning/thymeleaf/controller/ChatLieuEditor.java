package org.o7planning.thymeleaf.controller;

import java.beans.PropertyEditorSupport;

import org.o7planning.thymeleaf.model.ChatLieu;
import org.o7planning.thymeleaf.service.ChatLieuService;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatLieuEditor extends PropertyEditorSupport {
    
    @Autowired
    private ChatLieuService chatLieuService;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        ChatLieu chatLieu = chatLieuService.getChatLieuById(Integer.parseInt(text));
        this.setValue(chatLieu);
    }
}
