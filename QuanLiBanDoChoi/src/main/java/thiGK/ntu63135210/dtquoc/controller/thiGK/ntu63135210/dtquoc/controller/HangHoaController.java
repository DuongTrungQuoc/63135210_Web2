package thiGK.ntu63135210.dtquoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import thiGK.ntu63135210.dtquoc.model.HangHoa;
import thiGK.ntu63135210.dtquoc.service.ChatLieuService;
import thiGK.ntu63135210.dtquoc.service.HangHoaService;

@Controller
public class HangHoaController {
    @Autowired
    private HangHoaService hangHoaService;

    @Autowired
    private ChatLieuService chatLieuService;

    @GetMapping("/hanghoa")
    public String viewHomePage(Model model) {
        model.addAttribute("listHangHoa", hangHoaService.findAll());
        return "index";
    }

    @GetMapping("/showNewHangHoaForm")
    public String showNewHangHoaForm(Model model) {
        HangHoa hangHoa = new HangHoa();
        model.addAttribute("hangHoa", hangHoa);
        model.addAttribute("listChatLieu", chatLieuService.findAll());
        return "new_hanghoa";
    }

    @PostMapping("/saveHangHoa")
    public String saveHangHoa(HangHoa hangHoa) {
        hangHoaService.save(hangHoa);
        return "redirect:/hanghoa";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model) {
        HangHoa hangHoa = hangHoaService.findById(id);
        model.addAttribute("hangHoa", hangHoa);
        model.addAttribute("listChatLieu", chatLieuService.findAll());
        return "update_hanghoa";
    }

    @GetMapping("/deleteHangHoa/{id}")
    public String deleteHangHoa(@PathVariable(value = "id") Integer id) {
        hangHoaService.delete(id);
        return "redirect:/hanghoa";
    }
}
