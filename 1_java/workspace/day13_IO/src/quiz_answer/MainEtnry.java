package quiz_answer;

import java.io.IOException;
import java.util.Scanner;

public class MainEtnry {  // view
	
    public static void main(String[] args) throws IOException {
    	
        Scanner sc = new Scanner(System.in);
        BMIManager manager=new BMIManager();

        while(true){
            menu();
            switch (Integer.parseInt(sc.next())) {
                case 1:
                    manager.addBMI();
                    break;
                case 2:
                    manager.delBMI();
                    break;
                case 3:
                    manager.printList();
                    break;
                case 4:
                    manager.modBMI();
                    break;
                case 5:
                    manager.saveListAtDB();
                    break;
                case 6:
                    manager.printListAtDB();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("메뉴를 선택하여주세요: ");
        System.out.println("1: 추가 2: 삭제 3: 목록 출력 4: 수정 5: DB에 저장 6: DB출력 7:종료");
    }

}
