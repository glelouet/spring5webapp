package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRep) {
		authorRepository = authorRep;
	}

	@GetMapping("/authors/list")
	public String getAuthors(Model model) {

		model.addAttribute("authors", authorRepository.findAll());

		return "authors/list.html";
	}

}
