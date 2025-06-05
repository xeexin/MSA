package edu.kosa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
	JSON 예제
		{
			"account" : "임희진",
			"email" : "kosa@sw.or.kr",
			"address" : "seoul",
			"password" : "1234",
			"phone_number" : "4220",
			"OTP" : "OTP"
		}
*/


@Data
public class PostDTO {
	private String account;
	
	private String email;
	
	private String address;
	
	private String password;
	
	@JsonProperty("phone_number")
	private String phoneNumber;  //snake_case로!!!
	
	@JsonProperty("OTP")
	private String OTP;
}
