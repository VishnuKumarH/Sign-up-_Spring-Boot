package com.ust.spring.signupaug2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.spring.signupaug2.service.emailService;

@SpringBootApplication
@RestController
@CrossOrigin({"http://localhost:4200/","*"})
public class SignupAug2Application {

          @Autowired
          private emailService es;

           

		  @GetMapping
		  public String sendEmail(){

			String otp="";


			for(int i=0;i<6;i++){
				int digit = (int) (Math.random()*10);

				otp+=digit;



			}
			es.send("vishnukumarh77@gmail.com", "hi", otp+" is the OTP to signup to our website. Do not share OTP with anyone.");




			return otp;

			

		  }




	public static void main(String[] args) {
		SpringApplication.run(SignupAug2Application.class, args);


	}

}
