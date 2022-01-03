package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")

	public String index(Model model, @RequestParam(name = "name", defaultValue = "Default") String nameParam) {

		if (nameParam == null) {
			nameParam = "Default";
		}

		model.addAttribute("name", "Andrea");

		return "index";
	}

	@GetMapping("/movies")

	public String movies(Model model) {

		model.addAttribute("movies", Arrays.asList("The Hand of God", "The card counter", "The guilty", "Old"));

		return "movies";
	}

	@GetMapping("/songs")

	public String songs(Model model) {

		model.addAttribute("songs", Arrays.asList("Rapstar","White Dress","To be Loved","Amoeba"));
		
		return "songs";
	}
}
