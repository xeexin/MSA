package quiz_answer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BMIManager {
	
    private ArrayList<BMI> BMIlist;
    private Scanner sc;

    FileManager FM;


    public BMIManager() throws IOException {
        this.BMIlist = new ArrayList<BMI>();
        this.sc = new Scanner(System.in);
        this.FM = new FileManager();
        this.FM.setFileName("BMIDB.txt");

    }

    public void addBMI(){
        System.out.println("input name:");
        String name = sc.next();
        System.out.println("input weight: ");
        Integer weight =Integer.parseInt(sc.next());
        System.out.println("input height: ");
        Integer height =Integer.parseInt(sc.next());
        System.out.println("input sex (1 : 남/ 2 : 여 ) : ");
        Integer sex = Integer.parseInt(sc.next());
        BMIlist.add(new BMI(name,weight,height,sex));
    }

    public void delBMI(){
        System.out.println("삭제할 사람을 선택하세요 (인덱스는 0부터)");
        printList();
        int index= Integer.parseInt(sc.next());
        
        if(index<BMIlist.size()){
            BMIlist.remove(index);
        }
        else{
            System.out.println("삭제할 index를 잘못 입력하셨습니다. ");
        }
    }
    
    public void modBMI(){
        System.out.println("수정할 사람을 선택하세요 (인덱스는 0부터) ");
        printList();
        int index = Integer.parseInt(sc.next());
        
        if(index<BMIlist.size()){
            BMIlist.remove(index);
            addBMI();
        }
        else{
            System.out.println("index가 잘못입력되었습니다.");
        }
    }

    public void printList(){
        String str = "";
        Iterator it = BMIlist.iterator();
        
        while(it.hasNext()){
            str+=it.next().toString();
        }
        System.out.println(str);
    }
    
    public void printListAtDB() throws IOException {
        FM.openFile('r');
        FM.closeFile();
    }


    public void saveListAtDB() throws IOException {
        String str = "";
        Iterator it = this.BMIlist.iterator();
        while(it.hasNext()){
            str+=it.next().toString();
        }
        FM.openFile('w');
        FM.fileWriteIFisOpen(str);
        FM.closeFile();

    }


}
