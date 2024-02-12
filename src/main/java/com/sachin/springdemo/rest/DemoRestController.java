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
	
	@GetMapping("/getDattaIntro")
		
		public String getDattaIntro(){
			StringBuilder sb1 = new StringBuilder();
			sb1.append("hello my name is Datta Shinge");
			sb1.append("From Latur Maharastra");
			sb1.append("<h1>My short-term goal is to get placed in a reputed company where I can improve my skills and knowledge.I developed many static and dynamic websites. I really enjoyed developing websites for to-do lists. It helps users keep track of their tasks.</h1>");
			return sb1.toString();
		}
	@CrossOrigin
	@GetMapping("/getAnjaliReddyIntro")
	public String getAnjaliReddyIntro() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello! My name is ");
		sb.append("<h2>Anjali Naragude</h2>");
		sb.append(", I am a dedicated and passionate individual who has successfully completed my Bachelor of Engineering degree with a specialization in [Computer Science] from SRTMUN University. During my academic journey, I developed a strong foundation in various aspects of engineering.I have practical experience as an intern at TechSophy, where I delved into the dynamic world of technology. My hands-on experience includes working with HTML, CSS, JavaScript, ReactJS, Core Java, API, and Spring Boot. These experiences have not only honed my technical skills but have also provided me with valuable insights into collaborative and innovative problem-solving.I am eager to contribute my skills and knowledge to dynamic projects, leveraging my proficiency in web development and Java-based technologies. Looking forward to new challenges and opportunities for growth in the field of technology.");
		
		return sb.toString(); 
	}
	
	@CrossOrigin
	@GetMapping("/getVaibhavKankanwadiIntro")
	public String getVaibhavKankanwadiIntro() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello! Myself DON 😎😎. ");
		
		return sb.toString(); 
	}

}
