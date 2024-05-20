package org.o7planning.thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChatLieu {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer maChatLieu;
	    private String tenChatLieu;

	    // Getters and Setters
	    public Integer getMaChatLieu() {
	        return maChatLieu;
	    }

	    public void setMaChatLieu(Integer maChatLieu) {
	        this.maChatLieu = maChatLieu;
	    }

	    public String getTenChatLieu() {
	        return tenChatLieu;
	    }

	    public void setTenChatLieu(String tenChatLieu) {
	        this.tenChatLieu = tenChatLieu;
	    }
}
