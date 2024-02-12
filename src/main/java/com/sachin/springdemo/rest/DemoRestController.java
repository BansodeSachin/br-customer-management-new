package com.sachin.springdemo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoRestController {
	
	@CrossOrigin
	@GetMapping("/getSachinBansodeIntro")
	public String getSachinBansodeIntro() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello! My name is ");
		sb.append("<h2>Sachin Bansode</h2>");
		sb.append(", and I am thrilled to have the opportunity to introduce myself. I am a [Your Profession or Student Major], currently [your current position or academic status]. With a passion for [mention a specific interest or field related to your profession], I have dedicated myself to [any relevant experience or achievements]. My journey has equipped me with valuable skills in [mention key skills], and I am always eager to learn and grow. Outside of [work or studies], I enjoy [hobbies or interests], which contribute to my well-rounded personality. I am excited to connect, collaborate, and embark on new challenges, and I look forward to the experiences and opportunities that the future holds.");
		
		return sb.toString(); 
	}
}
