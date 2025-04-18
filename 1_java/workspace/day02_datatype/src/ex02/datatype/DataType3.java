package ex02.datatype;

public class DataType3 {
	// 진법 -
	public static void main(String[] args) {
		int su = 10;

		System.out.println("10진수 : " + su);  // %d %o %x %X
		System.out.printf("10진수 : %d\n", su);
		System.out.printf("8진수 : %o\n", su);
		System.out.printf("1진수 : %x\n", su);
		System.out.printf("1진수 : %X\n", su);
		
		System.out.printf("%d %x %o %X \n", su, su, 10 ,10);
		
		
		//어떤 숫자에 0을 붙이면 8진수가 됨
		//어떤 숫자에 0x를 붙이면 16진수가 됨

		System.out.printf("%d\n",012); //(8진수 -> 10진수)
		System.out.printf("%s\n",0xA); //(16진수 -> 10진수)


	}
}
