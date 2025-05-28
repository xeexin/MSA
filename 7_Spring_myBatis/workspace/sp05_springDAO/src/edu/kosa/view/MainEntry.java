package edu.kosa.view;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao.di.UserDAO;
import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ctx.xml");

		UserDAO dao = ac.getBean("dao", UserDAO.class);
		dao.menu();
		Scanner sc = new Scanner(new InputStreamReader(System.in));

		switch (sc.nextInt()) {
		case 1:
			UserVO vo = new UserVO();

			System.out.print("User id : ");
			vo.setId(sc.next());
			System.out.print("User name : ");
			vo.setName(sc.next());
			System.out.print("User password : ");
			vo.setPassword(sc.next());

			dao.insert(vo);
			System.out.println(vo.getId() + " 추가 성공");
			System.out.println("-------------------------");
			break;

		case 2:
			// SelectAll()
			dao.selectAll();
			break;

		case 3:
			// DeleteById
			dao.selectAll();
			System.out.print("삭제할 ID를 입력하세요 : ");
			String num = sc.next();
			dao.deleteById(num);
			break;
		default:
			System.out.println("올바른 숫자를 입력해 주세요.");
			break;
		}
	}
}
