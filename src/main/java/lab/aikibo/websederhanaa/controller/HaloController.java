package lab.aikibo.websederhanaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloController {

    @GetMapping("/halo")
    public String haloRequest(@RequestParam(name="nama", required = false, defaultValue = "Kawan") String nama,
                              Model model) {
        model.addAttribute("nama", nama);
        return "sapa";
    }

}
