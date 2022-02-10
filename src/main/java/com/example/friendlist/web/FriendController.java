package com.example.friendlist.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.friendlist.model.Kaveri;

@Controller
public class FriendController {
	private List<Kaveri> kaverit = new ArrayList<Kaveri>();
	
	@GetMapping("/index")
	public String naytaLomake(Model model) {
		System.out.println("OLLAAN NAYTALOMAKKEESSA");
		model.addAttribute("kaveri", new Kaveri());
		return "index";
	}

	@PostMapping("/index")
	public String kasitteleKaveri(@ModelAttribute Kaveri kaveri, Model model) {
		System.out.println("OLLAAN KASITTELEKAVERIMETODISSA");
		kaverit.add(kaveri);
		model.addAttribute("kaverit", kaverit);
		model.addAttribute("kaveri", new Kaveri());
		return "index";
	}
}