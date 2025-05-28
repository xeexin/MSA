package edu.kosa.model;

import lombok.Getter;
import lombok.Setter;

// MODEL  -VO, -DTO, -TO

@Getter
@Setter
public class UserVO {
	private String id, name, password;
	
	// setter method -> DI 
}
