package ex03.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptDTO {
	// deptno dname loc
	private int deptno;
	private String dname,loc;	
}
