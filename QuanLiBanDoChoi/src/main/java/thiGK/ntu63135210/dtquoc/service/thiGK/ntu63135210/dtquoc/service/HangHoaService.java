package thiGK.ntu63135210.dtquoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63135210.dtquoc.model.HangHoa;
import thiGK.ntu63135210.dtquoc.repository.HangHoaRepository;

@Service
public class HangHoaService {
    @Autowired
    private HangHoaRepository hangHoaRepository;

    public List<HangHoa> findAll() {
        return hangHoaRepository.findAll();
    }

    public void save(HangHoa hangHoa) {
        hangHoaRepository.save(hangHoa);
    }

    public void delete(Integer id) {
        hangHoaRepository.deleteById(id);
    }

    public HangHoa findById(Integer id) {
        return hangHoaRepository.findById(id).orElse(null);
    }
}
