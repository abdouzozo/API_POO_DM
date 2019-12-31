package nov_APIPOO.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdresseCtrlDM2 {
	@GetMapping("/adresse")
	public String adresse(Model model) {
		return "adresse";
	}
}
