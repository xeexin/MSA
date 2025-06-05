package edu.kosa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // DELETE , http://localhost:8081/api
public class DeleteApiController {

	@DeleteMapping("/delete/{userId}") // http://localhost:8081/api/delete/300   ?account=doyeon
	public void delete(@PathVariable(name = "userId") String userId) {
		
		System.out.println("[userId : " + userId + "]");

	// delete --> 리소스 삭제 200 OK, 자원이 있어서 삭제하던, 없어서 삭제하던 200을 리턴함	
	}
	
}
