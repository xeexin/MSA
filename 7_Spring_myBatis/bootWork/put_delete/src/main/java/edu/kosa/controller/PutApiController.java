package edu.kosa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.kosa.PutDeleteApplication;
import edu.kosa.dto.PostRequestDTO;

/*
	{
    
        "name" : "doyeon",
        "age" : 33,
        "car_list" : [
                
                {
                    "name" : "BMW",
                    "car_number" : "11가 1234"
                },
                {
                    "name" : "A4",
                    "car_number" : "22나 7890"
                }
                
            ]
    
    }
*/

@RestController
@RequestMapping("/api") // PUT , http://localhost:8081/api
public class PutApiController {

	private final PutDeleteApplication putDeleteApplication;

	PutApiController(PutDeleteApplication putDeleteApplication) {
		this.putDeleteApplication = putDeleteApplication;
	}

//	@PutMapping("/put") // http://localhost:8081/api/put
//	public void put(@RequestBody PostRequestDTO dto) {
//		System.out.println("dto : " + dto);
//	}

	@RequestMapping("/put")
	public PostRequestDTO put(@RequestBody PostRequestDTO dto) {
		System.out.println(dto);
		return dto;
	}

	@PutMapping("/put-id/{userId}") // http://localhost:8081/api/put-id/100
	public PostRequestDTO put(@RequestBody PostRequestDTO dto, @PathVariable(name = "userId") Long id) {
		System.out.println("userId : " + id);
		return dto;
	}
}
