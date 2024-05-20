package thiGK.ntu63135210.dtquoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu63135210.dtquoc.model.ChatLieu;
import thiGK.ntu63135210.dtquoc.repository.ChatLieuRepository;

@Service
public class ChatLieuService {
    private final ChatLieuRepository chatLieuRepository = null;

    public List<ChatLieu> findAll() {
        return chatLieuRepository.findAll();
    }

    public void save(ChatLieu chatLieu) {
        chatLieuRepository.save(chatLieu);
    }

    public void delete(Integer id) {
        chatLieuRepository.deleteById(id);
    }

    public ChatLieu findById(Integer id) {
        return chatLieuRepository.findById(id).orElse(null);
    }
}
