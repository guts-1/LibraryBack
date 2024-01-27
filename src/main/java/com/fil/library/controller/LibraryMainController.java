package com.fil.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LibraryMainController {

	@GetMapping
	public String getMainPage() {
		return "Hello, Docker!";
	}
}
