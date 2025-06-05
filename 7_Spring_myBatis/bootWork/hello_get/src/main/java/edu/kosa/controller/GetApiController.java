package edu.kosa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.kosa.dto.UserDTO;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

	@GetMapping("/hello")
	public String getHello() {
		return "<h1>Hello SpringBoot!!</h1>";
	}

	@GetMapping("/hi")
	public String hi() {
		return "<font color='red'>HI!!!</font>";
	}

	// 주소줄에 대문자 안됨!
	@GetMapping("/path-variable/{id}") // http://localhost:8081/api/get/path-variable
	public String pathVariable(@PathVariable(name = "id") String id) {
		System.out.println("PathVariable : " + id);
		return id;
	}

	// ?key=value&key2=value2&key3=value3...
	@GetMapping(path = "query-param") // http://localhost:8081/api/get/query-param?name=yuna&email=aa@kosa.com&age=33
	public String queryParam(@RequestParam Map<String, String> queryParam) {
		StringBuilder sb = new StringBuilder();
		queryParam.entrySet().forEach(entry -> {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());

			sb.append(entry.getKey() + "=" + entry.getValue());
		});

		return sb.toString();
	}

	@GetMapping(path = "query-param02") // http://localhost:8081/api/get/query-param02?name=yuna&email=aa@kosa.com&age=33
	public String queryParam(@RequestParam String name, @RequestParam String email, @RequestParam String age) {

		return name + ", " + email + ", " + age;

	}

	@GetMapping(path = "query-param03") // http://localhost:8081/api/get/query-param03?name=yuna&email=aa@kosa.com&age=33
	public String queryParam(UserDTO dto) {

		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getAge());

		return dto.toString();

	}

}
