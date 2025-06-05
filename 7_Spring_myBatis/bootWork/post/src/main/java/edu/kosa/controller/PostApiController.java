package edu.kosa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.kosa.dto.PostDTO;

/**
 * json : snake_case 사용
 * 
 * Key는 무조건 String
 * 
 * String : value number : value boolean : value Object : value { } array :
 * value [ ]
 * 
 * { "phone_number" : "010-1111-2222", // camelCase, PascalCase, snake_case
 * "age" : 10, "isAgree" : false, "account" : { "email" :
 * "xeexin0331@gmail.com", "password" : "1234" }
 * 
 * //user 조회 하는 경우 { "user_list" : [ { "account" : "xeexin", "password" : "1234"
 * }, { "account" : "aaa", "password" : "1111" }, { "account" : "bbb",
 * "password" : "1111" } ] }
 * 
 * }
 * 
 */

@RestController
@RequestMapping("/api") // POST, http://localhost:8081/api
public class PostApiController {

	@PostMapping("/post") // http://localhost:8081/api/post
	public void post(@RequestBody Map<String, Object> map) {
		// key value 동시에 받기
//		 map.entrySet().forEach(obj -> {
//			System.out.println("key :"  + obj.getKey()); 
//			System.out.println("value :"  + obj.getValue()); 
//			System.out.println("------------------------");
//		 });

		// key value 따로 받기
		map.forEach((key, value) -> {
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			System.out.println("------------------------");
		});
	}

	@PostMapping("/post-object")  // http://localhost:8081/api/post-object
	public void postObject(@RequestBody PostDTO dto) {
		System.out.println(dto);
		

	}

}
