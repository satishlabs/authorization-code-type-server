package com.oauth.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookPriceController {
	
	@GetMapping("/bookPrice/{bookId}")
	public BookPriceInfo getBookPriceById(@PathVariable Integer bookId) {
		System.out.println("BookPriceController -- getBookPriceById()");
		BookPriceInfo bInfo = new BookPriceInfo(bookId, "Spring Microservices", 540.0);
		return bInfo;
	}
}
