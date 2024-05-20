package org.o7planning.thymeleaf.service;

import java.util.List;

import org.o7planning.thymeleaf.model.HangHoa;
import org.o7planning.thymeleaf.repository.HangHoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HangHoaService {
	 @Autowired
	    private HangHoaRepository hangHoaRepository;

	    public List<HangHoa> getAllHangHoa() {
	        return hangHoaRepository.findAll();
	    }

	    public void saveHangHoa(HangHoa hangHoa) {
	        hangHoaRepository.save(hangHoa);
	    }

	    public HangHoa getHangHoaById(Integer id) {
	        return hangHoaRepository.findById(id).orElse(null);
	    }

	    public void deleteHangHoaById(Integer id) {
	        hangHoaRepository.deleteById(id);
	    }
	
}
