package StudClass;

import javax.persistence.*;
//import javax.persistence.ID;


@Entity
public class students {
	@Id
	private int rollNo;
	
	private String name;
	
	private int mark;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "students [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
	}
	

}
