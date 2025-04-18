package ex03.Enum;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

public class EnumTest {

	Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void telltLinkedltls() {
		switch (day) {
		case MONDAY: {
			System.out.println("MONDAYs are bed.");
			break;
		}
		case TUESDAY: {
			System.out.println("TUESDAY are bed.");
			break;
		}
		case WEDNESDAY: {
			System.out.println("WEDNESDAY are bed.");
			break;
		}
		case THURSDAY: {
			System.out.println("THURSDAY are bed.");
			break;
		}
		case FRIDAY: {
			System.out.println("FRIDAY are bed.");
			break;
		}
		case SATURDAY: {
			System.out.println("SATURDAY are bed.");
			break;
		}
		case SUNDAY: {
			System.out.println("SUNDAY are bed.");
			break;
		}

		} //switch end
	}
	
	public static void main(String[] args) {
		EnumTest firstDay= new EnumTest(Day.MONDAY);
		firstDay.telltLinkedltls();
		
		
		EnumTest thirdDay= new EnumTest(Day.WEDNESDAY);
		thirdDay.telltLinkedltls();
		
		
		EnumTest sixthDay= new EnumTest(Day.SATURDAY);
		sixthDay.telltLinkedltls();
	}
}
